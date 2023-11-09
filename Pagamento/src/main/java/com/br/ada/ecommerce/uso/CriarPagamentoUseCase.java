package com.br.ada.ecommerce.uso;

import com.br.ada.ecommerce.dominios.Pagamento;
import com.br.ada.ecommerce.portas.entrada.CriarPagamentoInputPort;
import com.br.ada.ecommerce.portas.saida.CobrarCartaoOutputPort;
import com.br.ada.ecommerce.portas.saida.PagamentoRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarPagamentoUseCase implements CriarPagamentoInputPort {


    @Autowired
    private PagamentoRepositoryPort pagamentoRepositoryPort;

    @Autowired
    private CobrarCartaoOutputPort cobrarCartaoOutputPort;

    @Override
    public Pagamento criar(Pagamento pagamento) {
        var pagamentoCriado = cobrarCartaoOutputPort.cobrar(pagamento);
        return pagamentoRepositoryPort.save(pagamentoCriado);
    }
}
