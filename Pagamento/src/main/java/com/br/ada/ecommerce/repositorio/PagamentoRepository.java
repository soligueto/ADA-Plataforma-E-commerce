package com.br.ada.ecommerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ada.ecommerce.entidades.PagamentoEntity;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoEntity, String> {
}
