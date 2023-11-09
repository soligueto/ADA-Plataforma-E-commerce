package com.br.ada.ecommerce.utils;

import com.br.ada.ecommerce.dominios.Produto;
import com.br.ada.ecommerce.entidades.ProdutoEntity;

import org.mapstruct.Mapper;

@Mapper
public interface ProdutoMapper {

    Produto toDomain(ProdutoEntity produtoEntity);

    ProdutoEntity toEntity(Produto produto);
}
