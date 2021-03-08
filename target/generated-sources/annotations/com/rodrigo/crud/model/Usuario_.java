package com.rodrigo.crud.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, Long> idade;
	public static volatile SingularAttribute<Usuario, String> profissao;
	public static volatile SingularAttribute<Usuario, String> nome;
	public static volatile SingularAttribute<Usuario, Long> id;

	public static final String IDADE = "idade";
	public static final String PROFISSAO = "profissao";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

