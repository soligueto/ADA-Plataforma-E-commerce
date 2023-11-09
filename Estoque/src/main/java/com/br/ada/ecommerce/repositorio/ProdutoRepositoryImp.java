package com.br.ada.ecommerce.repositorio;

import com.br.ada.ecommerce.dominios.Produto;
import com.br.ada.ecommerce.dominios.Reserva;
import com.br.ada.ecommerce.entidades.ReservaEntity;
import com.br.ada.ecommerce.porta.saida.ReservaRepositoryPort;
import com.br.ada.ecommerce.utils.ProdutoMapper;
import com.br.ada.ecommerce.utils.ReservaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ProdutoRepositoryImp implements ReservaRepositoryPort {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private ProdutoMapper produtoMapper;

    @Autowired
    private ReservaMapper reservaMapper;

    @Override
    public Produto buscarProduto(String idProduto) {
        var produtoentity = produtoRepository.findById(idProduto).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return produtoMapper.toDomain(produtoentity);
    }

    @Override
    @Transactional
    public Reserva criarReserva(Reserva reserva) {
        var reservaEntity = new ReservaEntity(reserva);
        reservaEntity.preparaInsert();
        var reservaSalva = reservaRepository.save(reservaEntity);

        reservaEntity.getProdutos().forEach(produto ->{
            produtoRepository.diminuiEstoque(produto.getProdutoId(), produto.getQuantidadeReservada());
        });

        return reservaMapper.toDomain(reservaSalva);
    }
}
