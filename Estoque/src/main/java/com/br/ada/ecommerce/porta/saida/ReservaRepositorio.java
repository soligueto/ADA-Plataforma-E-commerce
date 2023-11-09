package com.br.ada.ecommerce.porta.saida;

import com.br.ada.ecommerce.dominios.Produto;
import com.br.ada.ecommerce.dominios.Reserva;

public interface ReservaRepositorio {

    Produto buscarProduto(String idProduto);
    Reserva criarReserva(Reserva reserva);
}
