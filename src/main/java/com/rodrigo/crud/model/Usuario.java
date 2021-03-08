package com.rodrigo.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "usuario")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	@ApiModelProperty(value = "Identificador único do usuario")
	@EqualsAndHashCode.Include
	private Long id;

    @Column(name = "nome")
	private String nome;
    
    @Column(name = "idade")
	private Long idade;

    @Column(name = "profissao")
	private String profissao;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdade() {
        return this.idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
}
