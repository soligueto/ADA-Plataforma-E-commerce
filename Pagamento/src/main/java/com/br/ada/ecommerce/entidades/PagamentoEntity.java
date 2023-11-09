package com.br.ada.ecommerce.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.br.ada.ecommerce.dominios.StatusPagamento;

@Entity
@Table(name="pagamentos")
@Data
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name="status_pagamento")
    private StatusPagamento statusPagamento;

    @Column(name="venda_id")
    private String vendaId;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pagamento")
    private DadosCobrancaEntity dadosCobranca;

    @Column(name="autenticacao_pagamento")
    private String autenticacaoPagamento;

    @Column(name="data_pagamento")
    private LocalDate dataPagamento;

    @Column(name="valor_pagamento")
    private BigDecimal valorPagamento;

}
