package com.br.ada.ecommerce.adaptadores.saida;

import com.br.ada.ecommerce.dominios.Pagamento;
import com.br.ada.ecommerce.dominios.StatusPagamento;
import com.br.ada.ecommerce.portas.saida.CobrarCartaoOutputPort;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GatewayPagamentoAdapter implements CobrarCartaoOutputPort {

    @Override
    public Pagamento cobrar(Pagamento pagamento) {

        if (pagamento.getValorPagamento().compareTo(BigDecimal.valueOf(1500L)) <= 0) {
            pagamento.setStatusPagamento(StatusPagamento.APROVADO);
        } else {
            pagamento.setStatusPagamento(StatusPagamento.NEGADO);
        }
        return pagamento;
    }
}
