package com.br.ada.ecommerce.portas.saida;

import com.br.ada.ecommerce.dominio.Venda;

public interface VendaCriadaEventPort {
    void vendaCriada(Venda venda);
}
