package src.io.demo.livraria.entities;

public class publishingCompany {

	private String nomeFantasia, razaoSocial, cnpj;

	public publishingCompany(String nomeFantasia, String razaoSocial, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Editora [nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}

}
