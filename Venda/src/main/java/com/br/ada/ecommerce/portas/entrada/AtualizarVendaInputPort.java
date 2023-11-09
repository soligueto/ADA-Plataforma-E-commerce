package com.br.ada.ecommerce.portas.entrada;

import com.br.ada.ecommerce.dominio.StatusVenda;

public interface AtualizarVendaInputPort {

    void atualizar(String idVenda, StatusVenda status, String motivo);
}
