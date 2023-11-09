package com.br.ada.ecommerce.eventos;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.fasterxml.jackson.annotation.JsonProperty;

public record AtualizacaoStatusEvent(@JsonProperty("status_venda") StatusVenda status, String motivo) {
}
