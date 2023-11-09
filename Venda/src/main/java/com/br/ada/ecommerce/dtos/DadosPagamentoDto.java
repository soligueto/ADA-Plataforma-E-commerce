package com.br.ada.ecommerce.dtos;

import com.br.ada.ecommerce.dominio.TipoPagamento;
import com.fasterxml.jackson.annotation.JsonProperty;


public record DadosPagamentoDto(@JsonProperty("numero_cartao") String numeroCartao,
                                @JsonProperty("tipo_pagamento") TipoPagamento tipoPagamento,
                                @JsonProperty("nome_titular") String nomeTitular,
                                @JsonProperty("data_validade") String dataValidade,
                                @JsonProperty("codigo_seguranca") String codigoSeguranca) {
}
