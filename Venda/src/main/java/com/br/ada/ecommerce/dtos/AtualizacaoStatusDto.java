package com.br.ada.ecommerce.dtos;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.fasterxml.jackson.annotation.JsonProperty;

public record AtualizacaoStatusDto(@JsonProperty("status_venda") StatusVenda status, String motivo) {
}
