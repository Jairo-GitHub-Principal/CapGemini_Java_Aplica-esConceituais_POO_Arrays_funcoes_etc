
public class Pessoa {
	
	private String nome;
	private int idade;
	private String situacao;
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", situacao=" + situacao + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
		
	
	
     
	
}
