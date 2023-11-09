package com.br.ada.ecommerce.dominio;

import lombok.Data;

@Data
public class Venda {

    private String vendaId;
    private String clienteId;
    private Produtos produtos;
    private DadosPagamento dadosPagamento;

}
