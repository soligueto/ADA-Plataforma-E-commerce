package com.br.ada.ecommerce.portas.saida;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.br.ada.ecommerce.dominio.Venda;

public interface VendaRepositoryPort {
    Venda save(Venda venda);
    void atualizaStatus(String idVenda, StatusVenda status, String motivo);

    Venda buscar(String idVenda);
}
