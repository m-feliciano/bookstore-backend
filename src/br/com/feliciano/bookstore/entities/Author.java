package br.com.feliciano.bookstore.entities;

public class Author {

	private String name;
	private String cpf;
	private String email;

	public Author(String name, String cpf, String email) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("name must be more than 2 characters");
		}
		this.cpf = cpf;
		this.email = email;
		this.name = name;
	}

	public Author() {
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("Author=[")
				.append("name=")
				.append(name)
				.append(", CPF=")
				.append(cpf)
				.append(" Email=")
				.append(email)
				.append("]")
				.toString();}

}