package src.io.demo.livraria.entities;

public class Author {

	private String name, cpf, email;

	public Author(String name, String cpf, String email) {
		if (name.length() > 2) {
			this.name = name;
			this.cpf = cpf;
			this.email = email;
		} else {
			System.out.println("name must be more than 2 characters");
		}

	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Author= { name: " + name + " CPF: " + cpf + " Email: " + email + " }";
	}

}