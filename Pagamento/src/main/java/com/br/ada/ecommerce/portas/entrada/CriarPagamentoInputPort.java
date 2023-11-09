package com.br.ada.ecommerce.portas.entrada;

import com.br.ada.ecommerce.dominios.Pagamento;

public interface CriarPagamentoInputPort {
    Pagamento criar(Pagamento pagamento);
}
