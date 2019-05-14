package dominio;

import java.util.Date;

public class Contrato {
	private Integer codContrato;
	private Date data;
	public Integer getCodContrato() {
		return codContrato;
	}
	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codContrato == null) ? 0 : codContrato.hashCode());
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
		Contrato other = (Contrato) obj;
		if (codContrato == null) {
			if (other.codContrato != null)
				return false;
		} else if (!codContrato.equals(other.codContrato))
			return false;
		return true;
	}
	
	
}
