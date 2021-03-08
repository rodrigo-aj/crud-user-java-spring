package com.rodrigo.crud.repository;

import com.rodrigo.crud.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   
}