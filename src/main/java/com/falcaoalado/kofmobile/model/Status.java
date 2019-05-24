package com.falcaoalado.kofmobile.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Status {

	@NotNull(message = "Aptitude {validacao.campo.nulo}")
	private Integer aptitude;
	@NotNull(message = "Ataque {validacao.campo.nulo}")
	private Integer ataque;
	@NotNull(message = "Defesa {validacao.campo.nulo}")
	private Integer defesa;
	@NotNull(message = "HP {validacao.campo.nulo}")
	private Integer hp;

	public Status(Integer aptitude, Integer ataque, Integer defesa, Integer hp) {
		this.aptitude = aptitude;
		this.ataque = ataque;
		this.defesa = defesa;
		this.hp = hp;
	}

	public Status() {
	}

	public Integer getAptitude() {
		return aptitude;
	}

	public void setAptitude(Integer aptitude) {
		this.aptitude = aptitude;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aptitude == null) ? 0 : aptitude.hashCode());
		result = prime * result + ((ataque == null) ? 0 : ataque.hashCode());
		result = prime * result + ((defesa == null) ? 0 : defesa.hashCode());
		result = prime * result + ((hp == null) ? 0 : hp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Status other = (Status) obj;
		if (aptitude == null) {
			if (other.aptitude != null)
				return false;
		} else if (!aptitude.equals(other.aptitude))
			return false;
		if (ataque == null) {
			if (other.ataque != null)
				return false;
		} else if (!ataque.equals(other.ataque))
			return false;
		if (defesa == null) {
			if (other.defesa != null)
				return false;
		} else if (!defesa.equals(other.defesa))
			return false;
		if (hp == null) {
			if (other.hp != null)
				return false;
		} else if (!hp.equals(other.hp))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Status [aptitude=" + aptitude + ", ataque=" + ataque + ", defesa=" + defesa + ", hp=" + hp + "]";
	}

}
