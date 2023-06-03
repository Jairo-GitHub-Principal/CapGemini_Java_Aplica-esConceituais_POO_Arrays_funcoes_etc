
public class PessoaFisica extends Pessoa {
	private String cpf;
	private String identidade;
	Pessoa p=new Pessoa();
	
	@Override
	public String toString() {													// como a propriedade nome esta privada tenho que fazer o get aqui para atribuir valor da propriedade nome da classe Pesso, para a propriedade nome do meu toString()			
		return "PessoaFisica [cpf=" + cpf + ", identidade=" + identidade + ", nome=" + p.getNome() + ", idade=" + p.getIdade()
				+ ", situacao=" + p.getSituacao() + "]";
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdentidade() {
		return identidade;
	}
	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}	
	

	
}
