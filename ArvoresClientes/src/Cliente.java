
public class Cliente {

	private Integer Id;
	
	private String Nome;
	
	private String Email;

	public Cliente(int id, String nome, String email) {
		this.Id = id;
		this.Nome = nome;
		this.Email = email;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	
	
	
}
