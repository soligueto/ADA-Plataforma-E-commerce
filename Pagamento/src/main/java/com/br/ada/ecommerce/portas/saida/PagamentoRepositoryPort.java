package com.br.ada.ecommerce.portas.saida;

import com.br.ada.ecommerce.dominios.Pagamento;

public interface PagamentoRepositoryPort {

    Pagamento save(Pagamento pagamento);
}
