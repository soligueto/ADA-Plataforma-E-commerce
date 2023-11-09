package com.br.ada.ecommerce.adaptadores;

import com.br.ada.ecommerce.dominios.Pagamento;
import com.br.ada.ecommerce.entidades.PagamentoEntity;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PagamentoMapper {

    PagamentoEntity toEntity(Pagamento pagamento);

    Pagamento toDomain(PagamentoEntity pagamentoEntity);

    @Mapping(target = "dadosCobranca.dataValidade", source = "dadosCobranca.dataValidade", dateFormat = "dd/MM/yyyy")
    Pagamento toDomain(PagamentoDto pagamentoDto);

    PagamentoDto toDto(Pagamento pagamento);

}
