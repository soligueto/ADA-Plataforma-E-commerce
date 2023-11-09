package com.br.ada.ecommerce.eventos;

import com.br.ada.ecommerce.dominios.TipoPagamento;
import com.fasterxml.jackson.annotation.JsonProperty;


public record DadosPagamentoEvent(@JsonProperty("numero_cartao") String numeroCartao,
                                  @JsonProperty("tipo_pagamento") TipoPagamento tipoPagamento,
                                  @JsonProperty("nome_titular") String nomeTitular,
                                  @JsonProperty("data_validade") String dataValidade,
                                  @JsonProperty("codigo_seguranca") String codigoSeguranca) {
}
