package com.br.ada.ecommerce.dominios;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Produto {

    private String id;
    private Integer quantidadeDisponivel;

    public Produto(String id, Integer quantidadeReservada) {
        this.id = id;
        this.quantidadeDisponivel = quantidadeReservada;
    }
}
