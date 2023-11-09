package com.br.ada.ecommerce.eventos;

import com.br.ada.ecommerce.dominios.StatusVenda;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record VendaEvent(String id,
                         List<ProdutoEvent> produtos,
                         @JsonProperty("client_id") String clienteId,
                         String dataPedido,
                         String valorTotal,
                         @JsonProperty("dados_pagamento") DadosPagamentoEvent dadosPagamento,
                         @JsonProperty("status_venda") StatusVenda statusVenda) {
}
