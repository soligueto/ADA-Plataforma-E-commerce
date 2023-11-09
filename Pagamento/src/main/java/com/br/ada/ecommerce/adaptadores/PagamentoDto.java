package com.br.ada.ecommerce.adaptadores;

import com.br.ada.ecommerce.dominios.StatusPagamento;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDate;

public record PagamentoDto(String id,
                           @JsonProperty("status_pagamento") StatusPagamento statusPagamento,
                           @JsonProperty("venda_id") String vendaId,
                           @JsonProperty("dados_cobranca") DadosCobrancaDto dadosCobranca,
                           @JsonProperty("autenticacao_pagamento") String autenticacaoPagamento,
                           @JsonProperty("data_pagamento") LocalDate dataPagamento,
                           @JsonProperty("valor_pagamento") BigDecimal valorPagamento) {


}
