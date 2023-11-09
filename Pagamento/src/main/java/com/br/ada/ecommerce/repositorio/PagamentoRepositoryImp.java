package com.br.ada.ecommerce.repositorio;

import com.br.ada.ecommerce.adaptadores.PagamentoMapper;
import com.br.ada.ecommerce.dominios.Pagamento;
import com.br.ada.ecommerce.portas.saida.PagamentoRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PagamentoRepositoryImp implements PagamentoRepositoryPort {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private PagamentoMapper pagamentoMapper;

    @Override
    public Pagamento save(Pagamento pagamento) {
        var pagamentoEntity = pagamentoMapper.toEntity(pagamento);
        return pagamentoMapper.toDomain(pagamentoRepository.save(pagamentoEntity));
    }
}
