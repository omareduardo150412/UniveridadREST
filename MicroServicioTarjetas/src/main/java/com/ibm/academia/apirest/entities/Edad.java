package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "edades", schema = "microservicio")
public class Edad implements Serializable 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name="edad_minima")
    private Integer edadMinima;
	
	@Column(name="edad_maxima")
    private Integer edadMaxima;
	
	@ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinColumn(name = "salario_id")
	private Salario salario;
	
	@ManyToMany(mappedBy = "edadesTarjeta", fetch = FetchType.LAZY) 
    private Set<Tarjeta> tarjetas;
	
	public Edad(Integer id, Integer edadMinima, Integer edadMaxima) {
		super();
		this.id = id;
		this.edadMinima = edadMinima;
		this.edadMaxima = edadMaxima;
	}
@Override
public int hashCode() {
	return Objects.hash(edadMaxima, edadMinima, id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Edad other = (Edad) obj;
	return Objects.equals(edadMaxima, other.edadMaxima) && Objects.equals(edadMinima, other.edadMinima)
			&& Objects.equals(id, other.id);
}

@Override
public String toString() {
	return "Edad [id=" + id + ", edadMinima=" + edadMinima + ", edadMaxima=" + edadMaxima + "]";
}

private static final long serialVersionUID = 3562034611319655042L;

}
