package com.br.ada.ecommerce.uso;

import com.br.ada.ecommerce.dominio.StatusVenda;
import com.br.ada.ecommerce.portas.entrada.AtualizarVendaInputPort;
import com.br.ada.ecommerce.portas.saida.VendaRepositoryPort;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AtualizarVendaUseCase implements AtualizarVendaInputPort {


    private final VendaRepositoryPort vendaRepositoryPort;

    @Override
    public void atualizar(String idVenda, StatusVenda status, String motivo) {

        vendaRepositoryPort.atualizaStatus(idVenda, status, motivo);
    }
}
