package com.br.ada.ecommerce.portas.saida;

import com.br.ada.ecommerce.dominios.Pagamento;

public interface CobrarCartaoOutputPort {

    Pagamento cobrar(Pagamento pagamento);
}
