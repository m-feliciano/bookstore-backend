package br.com.feliciano.bookstore.entities;

public class PublishingCompany {

	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;

	public PublishingCompany(String nomeFantasia, String razaoSocial, String cnpj) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	@Override
	public String toString() {
		return "Editora [nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}

}
