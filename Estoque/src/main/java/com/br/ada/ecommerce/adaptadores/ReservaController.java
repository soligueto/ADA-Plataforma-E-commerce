package com.br.ada.ecommerce.adaptadores;


import com.br.ada.ecommerce.estoque.adapters.dtos.ReservaDto;
import com.br.ada.ecommerce.portas.entrada.ReservaProdutoInputPort;
import com.br.ada.ecommerce.utils.ReservaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaProdutoInputPort reservaProdutoInputPort;

    @Autowired
    private ReservaMapper reservaMapper;

    @PostMapping
    public ReservaDto reservar(@RequestBody ReservaDto reservaDto) {
        var reservaCriada = reservaProdutoInputPort.reservar(reservaMapper.toDomain(reservaDto));
        return reservaMapper.toDto(reservaCriada);
    }
}
