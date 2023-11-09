package com.br.ada.ecommerce.dtos;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record VendaDto(String id,
                       List<ProdutoDto> produtos,
                       @JsonProperty("client_id") String clienteId,
                       String dataPedido,
                       String valorTotal,
                       @JsonProperty("dados_pagamento") DadosPagamentoDto dadosPagamento,
                       @JsonProperty("status_venda") StatusVenda statusVenda) {
}
