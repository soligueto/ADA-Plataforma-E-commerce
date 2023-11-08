package com.br.ada.ecommerce.clientes;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.ada.ecommerce.dtos.PagamentoRequestDto;
import com.br.ada.ecommerce.dtos.RespostaPagamentoDto;

@FeignClient(name="Pagamento", url="http://localhost:8081")
public interface PagamentoClient {

    @PostMapping(consumes = "application/json")
    RespostaPagamentoDto cobrarCartao(@RequestBody PagamentoRequestDto cobrancaCartaoDto);

}
