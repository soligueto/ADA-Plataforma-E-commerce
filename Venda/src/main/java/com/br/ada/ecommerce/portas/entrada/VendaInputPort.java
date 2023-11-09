package com.br.ada.ecommerce.portas.entrada;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.br.ada.ecommerce.dominio.Venda;

public interface VendaInputPort {

    Venda criar(Venda venda);

    void atualizar(String idVenda, StatusVenda status, String motivo);

    Venda buscar(String idVenda);

}
