package com.br.ada.ecommerce.portas.entrada;

import com.br.ada.ecommerce.dominio.Venda;

public interface CriarVendaInputPort {
    Venda criar(Venda venda);
}
