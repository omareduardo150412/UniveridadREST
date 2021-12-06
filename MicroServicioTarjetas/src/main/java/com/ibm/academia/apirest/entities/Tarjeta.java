package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import com.ibm.academia.apirest.enums.TipoTarjeta;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tarjetas", schema = "microservicio")
public class Tarjeta implements Serializable
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "tipo_tarjeta")
	@Enumerated(EnumType.STRING)
    private TipoTarjeta tipoTarjeta;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name = "edad_tarjeta", schema = "microservicio",
			joinColumns = @JoinColumn(name = "tarjeta_id"),
			inverseJoinColumns = @JoinColumn(name = "edad_id")
	)
	private Set<Edad> edadesTarjeta;
   
	public Tarjeta(Integer id, TipoTarjeta tipoTarjeta) {
		this.id = id;
		this.tipoTarjeta = tipoTarjeta;
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
	Tarjeta other = (Tarjeta) obj;
	return Objects.equals(id, other.id);
}

@Override
public String toString() {
	return "Tarjeta [id=" + id + ", tipoTarjeta=" + tipoTarjeta + "]";
}

private static final long serialVersionUID = 981638164090037153L;
   
}
