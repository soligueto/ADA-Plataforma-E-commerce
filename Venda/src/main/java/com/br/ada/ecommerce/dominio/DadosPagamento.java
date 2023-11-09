package com.br.ada.ecommerce.dominio;

import com.br.ada.ecommerce.entidades.VendaEntity;

import lombok.Data;

@Data
public class DadosPagamento {

    private String id;
    private VendaEntity venda;

    private TipoPagamento tipoPagamento;

    private String numeroCartao;

    private String nomeTitular;

    private String dataValidade;

    private String codigoSeguranca;

}
