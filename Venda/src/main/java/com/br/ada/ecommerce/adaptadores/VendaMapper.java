package com.br.ada.ecommerce.adaptadores;

import com.br.ada.ecommerce.dominio.DadosPagamento;
import com.br.ada.ecommerce.dominio.Produto;
import com.br.ada.ecommerce.dominio.Venda;
import com.br.ada.ecommerce.entidades.DadosPagamentoEntity;
import com.br.ada.ecommerce.entidades.ProdutoEntity;
import com.br.ada.ecommerce.entidades.VendaEntity;
import com.br.ada.ecommerce.venda.adapters.dto.VendaDto;
import com.br.ada.ecommerce.venda.adapters.event.VendaEvent;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface VendaMapper {


    VendaDto toDto(Venda venda);

    VendaEvent toEvent(Venda venda);
    Venda toDomain(VendaDto vendaDTO);

    @Mapping(source = "produtos", target = "produtos", qualifiedByName = "mapProdutosEntity")
    Venda toDomain(VendaEntity entity);

    @Named("mapProdutosEntity")
    default List<Produto> mapProdutosEntity(List<ProdutoEntity> produtos) {
        return produtos.
                stream().
                map(produtoEntity -> new Produto(produtoEntity.getIdProduto(), produtoEntity.getValor(), produtoEntity.getQuantidade()))
                .collect(Collectors.toList());
    }

    @Mapping(source = "produtos", target = "produtos", qualifiedByName = "mapProdutos")
    @Mapping(source = "dadosPagamento", target = "dadosPagamento", qualifiedByName = "mapDadosPagamento")
    VendaEntity toEntity(Venda venda);

    @Named("mapProdutos")
    default List<ProdutoEntity> mapProdutos(List<Produto> produtos) {
        return produtos.
                stream().
                map(ProdutoEntity::new)
                .collect(Collectors.toList());
    }

    @Named("mapDadosPagamento")
    default DadosPagamentoEntity mapDadosPagamento(DadosPagamento dadosPagamento) {
        DadosPagamentoEntity pagamentoEntity = new DadosPagamentoEntity();
        pagamentoEntity.setTipoPagamento(dadosPagamento.getTipoPagamento());
        pagamentoEntity.setNumeroCartao(dadosPagamento.getNumeroCartao());
        pagamentoEntity.setNomeTitular(dadosPagamento.getNomeTitular());
        pagamentoEntity.setDataValidade(dadosPagamento.getDataValidade());
        pagamentoEntity.setCodigoSeguranca(dadosPagamento.getCodigoSeguranca());
        return pagamentoEntity;
    }

}
