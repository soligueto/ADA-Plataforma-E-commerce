package com.br.ada.ecommerce.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ReverSucessoEventAdapter implements ReservaSucessoEventPort {

    @Autowired
    private KafkaTemplate<String, VendaEvent> kafkaTemplate;

    @Override
    public void estoqueReservadoComSucesso(VendaEvent vendaEvent){
        kafkaTemplate.send("estoque-sucesso", vendaEvent);
    }

}
