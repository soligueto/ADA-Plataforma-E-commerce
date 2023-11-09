package com.br.ada.ecommerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ada.ecommerce.entidades.VendaEntity;

public interface VendaRepository extends JpaRepository<VendaEntity, String> {
}
