package util;

public class QuartosDisponiveis {
	
	private String Name, Email;
	
	public QuartosDisponiveis(String name, String email) {
		this.Name = name;
		this.Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Name= " + Name + ", Email= " + Email;
	}

}
