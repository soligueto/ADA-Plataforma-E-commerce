package com.br.ada.ecommerce.entrada;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.br.ada.ecommerce.venda.adapters.event.VendaEvent;

@Component
public class ConsumerKafkaReservaSucesso {

    @KafkaListener(topics = "estoque-sucesso", groupId = "app-venda")
    public void estoqueReservadoComSucesso(VendaEvent vendaEvent) {
        System.out.println("Estoque reservado com sucesso: " + vendaEvent.id());
    }
}
