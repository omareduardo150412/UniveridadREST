package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pasiones", schema = "microservicio")
public class Pasion implements Serializable
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "nombre", nullable = false, length = 60)
	private String nombre;
	
	@OneToMany(mappedBy = "pasion", fetch = FetchType.LAZY)
	private Set<Salario> salarios;
	
	public Pasion(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
  
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pasion other = (Pasion) obj;
	return Objects.equals(id, other.id);
}
@Override
public String toString() {
	return "Pasion [id=" + id + ", nombre=" + nombre + "]";
}

private static final long serialVersionUID = 7484244406283672769L;
}
