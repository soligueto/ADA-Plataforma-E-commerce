package com.br.ada.ecommerce.entrada;

import com.br.ada.ecommerce.adaptadores.VendaMapper;
import com.br.ada.ecommerce.portas.entrada.AtualizarVendaInputPort;
import com.br.ada.ecommerce.portas.entrada.BuscarVendaInputPort;
import com.br.ada.ecommerce.portas.entrada.CriarVendaInputPort;
import com.br.ada.ecommerce.venda.adapters.dto.AtualizacaoStatusDto;
import com.br.ada.ecommerce.venda.adapters.dto.VendaDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private CriarVendaInputPort criarVendaInputPort;

    @Autowired
    private AtualizarVendaInputPort atualizarVendaInputPort;

    @Autowired
    private BuscarVendaInputPort buscarVendaInputPort;

    @Autowired
    private VendaMapper vendaMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VendaDto criar(@RequestBody VendaDto vendaDTO) {
        var venda = vendaMapper.toDomain(vendaDTO);
        return vendaMapper.toDto(criarVendaInputPort.criar(venda));
    }

    @PatchMapping("/{id}")
    public void atualizarVenda(@RequestBody AtualizacaoStatusDto status, @PathVariable("id") String idVenda){
        atualizarVendaInputPort.atualizar(idVenda, status.status(), status.motivo());
    }

    @GetMapping("/{id}")
    public VendaDto obterVenda(@PathVariable("id") String idVenda){
        return vendaMapper.toDto(buscarVendaInputPort.buscar(idVenda));
    }

}
