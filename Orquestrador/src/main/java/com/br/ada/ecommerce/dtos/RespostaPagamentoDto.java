package com.br.ada.ecommerce.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespostaPagamentoDto {
    @JsonProperty("status_pagamento")
    private String statusPagamento;

}
