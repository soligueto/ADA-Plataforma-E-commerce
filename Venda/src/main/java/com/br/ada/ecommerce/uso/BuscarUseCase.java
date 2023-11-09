package com.br.ada.ecommerce.uso;

import com.br.ada.ecommerce.dominio.Venda;
import com.br.ada.ecommerce.portas.entrada.BuscarVendaInputPort;
import com.br.ada.ecommerce.portas.saida.VendaRepositoryPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarUseCase implements BuscarVendaInputPort {

    @Autowired
    private VendaRepositoryPort vendaRepositoryPort;
    @Override
    public Venda buscar(String idVenda) {
        return vendaRepositoryPort.buscar(idVenda);
    }
}
