package com.br.ada.ecommerce.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ProdutoDto(String id, @JsonProperty("quantidade_disponivel") Integer quantidadeDisponivel) {

}

