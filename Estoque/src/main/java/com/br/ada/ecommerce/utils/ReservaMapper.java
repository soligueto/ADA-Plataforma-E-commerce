package com.br.ada.ecommerce.utils;

import com.br.ada.ecommerce.dominios.Produto;
import com.br.ada.ecommerce.dominios.Reserva;
import com.br.ada.ecommerce.entidades.ProdutoEntity;
import com.br.ada.ecommerce.entidades.ProdutoReservaEntity;
import com.br.ada.ecommerce.entidades.ReservaEntity;
import com.br.ada.ecommerce.estoque.adapters.dtos.ReservaDto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface ReservaMapper {

    @Mapping(source="produtos", target="produtos", qualifiedByName = "mapProdutosEntity")
    Reserva toDomain(ReservaEntity reservaEntity);

    @Named("mapProdutosEntity")
    default List<Produto> mapProdutosEntity(List<ProdutoReservaEntity> produtos) {
        return produtos.
                stream().
                map(produtoEntity -> new Produto(produtoEntity.getProdutoId(), produtoEntity.getQuantidadeReservada()))
                .collect(Collectors.toList());
    }

    Reserva toDomain(ReservaDto reservaDto);

    ReservaDto toDto(Reserva reserva);
}
