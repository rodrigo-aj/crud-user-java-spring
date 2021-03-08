package com.rodrigo.crud.resource;

import java.util.List;

import com.rodrigo.crud.model.Usuario;
import com.rodrigo.crud.repository.UsuarioRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/crud/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @GetMapping
	public List<Usuario> listar() {
        return usuarioRepository.findAll();
	}
    
    @GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable("id") Long id) {
		return usuarioRepository.findById(id).get();
	}

    @PostMapping
	public Usuario criar(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@PutMapping(value = "/{id}")
	public Usuario alterar(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
		
		Usuario usuarioSalvo = usuarioRepository.findById(id).get();


		BeanUtils.copyProperties(usuario, usuarioSalvo, "id");

		return usuarioRepository.save(usuarioSalvo);
	}

	@DeleteMapping(value = "/{id}")
	public void deletar(@PathVariable("id") Long id) {
		
		usuarioRepository.deleteById(id);
	}
}
