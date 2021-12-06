package com.ibm.academia.apirest.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "salarios", schema = "microservicio")
public class Salario implements Serializable 
{
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "tipo", nullable = false, length = 60)
    private String tipo;
    
    @Column(name = "salario_minimo")
    private Double salarioMinimo;
    
    @Column(name = "salario_maximo")
    private Double salarioMaximo;
    
    @ManyToOne(optional = true, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinColumn(name = "pasion_id")
    private Pasion pasion;
    
    @OneToMany(mappedBy = "salario", fetch = FetchType.LAZY) 
    private Set<Edad> edades ;
    
    
    public Salario(Integer id, String tipo, Double salarioMinimo, Double salarioMaximo) {
		this.id = id;
		this.tipo = tipo;
		this.salarioMinimo = salarioMinimo;
		this.salarioMaximo = salarioMaximo;
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
		Salario other = (Salario) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Salario [id=" + id + ", tipo=" + tipo + ", salarioMinimo=" + salarioMinimo + ", salarioMaximo="
				+ salarioMaximo + "]";
	}
	

	private static final long serialVersionUID = -2603841714529998351L;
}
