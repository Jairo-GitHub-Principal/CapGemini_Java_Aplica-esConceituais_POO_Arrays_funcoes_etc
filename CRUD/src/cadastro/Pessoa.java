package cadastro;

public class Pessoa {
	private int id;
	private String nome;
	private String email;
	
	public Pessoa() {	// construtor vazio, me permite instanciar a classe pessoa, sem 
						// a obrigatoriedade de informar os parametros que ele precisa para atribuir valores a suas propriedades 
	}
		
	public Pessoa(String nome, String email) {
		super();
		
		this.nome = nome;
		this.email = email;
	}
	
	public Pessoa(int id,String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	//ID_______________
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	
	//NOME________________________
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Email__________________________
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;	
	}
}
