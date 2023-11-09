package com.br.ada.ecommerce.evento;

import com.br.ada.ecommerce.adaptadores.VendaMapper;
import com.br.ada.ecommerce.dominio.Venda;
import com.br.ada.ecommerce.portas.saida.VendaCriadaEventPort;
import com.br.ada.ecommerce.venda.adapters.event.VendaEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class VendaCriadaEventoAdapter implements VendaCriadaEventPort {

    @Autowired
    private KafkaTemplate<String, VendaEvent> kafkaTemplate;

    @Autowired
    private VendaMapper vendaMapper;

    @Override
    public void vendaCriada(Venda venda) {
        var vendaEvent = vendaMapper.toEvent(venda);
        kafkaTemplate.send("venda-criada", vendaEvent);
    }
}
