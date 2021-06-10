package com.br.jdev_treinamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.jdev_treinamento.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//implementação para buscar por nome
	
	@Query( value = "select u from Usuario u where upper(trim(u.nome)) like %?1%" ) /* 1 ref. a um paramentro*/
	List<Usuario> buscarPorNome (String nome);

}
