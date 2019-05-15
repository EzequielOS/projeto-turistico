package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer codHotel;
	private String nome;
	private String cidade;
	private BigDecimal diaria;
	private List<Pacote> pacotes;

	public Integer getCodHotel() {
		return codHotel;
	}

	public void setCodHotel(Integer codHotel) {
		this.codHotel = codHotel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public BigDecimal getDiaria() {
		return diaria;
	}

	public void setDiaria(BigDecimal diaria) {
		this.diaria = diaria;
	}

	public List<Pacote> getPacotes() {
		return pacotes;
	}

	public void setPacotes(List<Pacote> pacotes) {
		this.pacotes = pacotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codHotel == null) ? 0 : codHotel.hashCode());
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
		Hotel other = (Hotel) obj;
		if (codHotel == null) {
			if (other.codHotel != null)
				return false;
		} else if (!codHotel.equals(other.codHotel))
			return false;
		return true;
	}

}
