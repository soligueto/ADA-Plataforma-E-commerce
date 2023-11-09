package com.br.ada.ecommerce.repositorio;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.br.ada.ecommerce.entidades.ProdutoEntity;

public interface RepositorioProduto extends JpaRepository<ProdutoEntity, String> {

    @Modifying
    @Query( value = "update PRODUTO set QUANTIDADE_DISPONIVEL = QUANTIDADE_DISPONIVEL - :quantidadeReservada where id = :produtoId", nativeQuery = true)
    void diminuiEstoque(@Param("produtoId") String produtoId, @Param("quantidadeReservada") Integer quantidadeReservada);
}
