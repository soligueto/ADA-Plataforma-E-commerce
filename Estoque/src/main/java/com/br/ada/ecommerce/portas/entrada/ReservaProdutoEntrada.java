package com.br.ada.ecommerce.portas.entrada;

import com.br.ada.ecommerce.dominios.Reserva;

public interface ReservaProdutoEntrada {
    Reserva reservar(Reserva reserva);
}
