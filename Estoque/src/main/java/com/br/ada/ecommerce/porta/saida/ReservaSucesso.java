package com.br.ada.ecommerce.porta.saida;

import com.br.ada.ecommerce.estoque.adapters.event.VendaEvent;

public interface ReservaSucesso {
    void estoqueReservadoComSucesso(VendaEvent vendaEvent);
}
