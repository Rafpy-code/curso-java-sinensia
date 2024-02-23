package com.clientes.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
/*
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
*/


@Entity
@Table(name="clientes")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	//@NotBlank
	//@NotEmpty(message ="El nombre no puede estar vacío.")
	//@Size(min=3, max=15,message="Debe contener al menos 3 letras.")
	//@Pattern(regexp = "[a-zA-Z]*", message="Sólo se admiten letras.")
	@Column(nullable = false)
	private String nombre;

	//@NotEmpty(message ="El apellido no puede estar vacío.")
	//@Size(min=3, max=15,message="Debe contener al menos 3 letras.")
	//@Pattern(regexp = "[a-zA-Z]*", message="Sólo se admiten letras.")
	@Column(nullable = false)
	private String apellido;

	//@NotEmpty(message ="El email no puede estar vacío.")
	//@Email(message="No es una dirección de email válida.")
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
