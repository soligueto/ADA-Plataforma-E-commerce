package com.br.ada.ecommerce.uso;

import com.br.ada.ecommerce.dominio.Venda;
import com.br.ada.ecommerce.portas.entrada.CriarVendaInputPort;
import com.br.ada.ecommerce.portas.saida.VendaCriadaEventPort;
import com.br.ada.ecommerce.portas.saida.VendaRepositoryPort;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CriarVendaUseCase implements CriarVendaInputPort {

    private final VendaCriadaEventPort vendaCriadaEventPort;
    private final VendaRepositoryPort vendaRepositoryPort;

    public Venda criar(Venda venda) {
        var vendaTEste = vendaRepositoryPort.save(venda);
        vendaCriadaEventPort.vendaCriada(vendaTEste);
        return vendaTEste;
    }
}
