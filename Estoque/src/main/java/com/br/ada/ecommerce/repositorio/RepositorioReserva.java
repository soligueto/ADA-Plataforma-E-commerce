package com.br.ada.ecommerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ada.ecommerce.entidades.ReservaEntity;

@Repository
public interface RepositorioReserva extends JpaRepository<ReservaEntity, String> {
}
