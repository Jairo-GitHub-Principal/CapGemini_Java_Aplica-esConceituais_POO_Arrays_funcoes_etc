
public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String inscEstadual;
	
	Pessoa p = new Pessoa();
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", nome=" + p.getNome() + ", idade=" + p.getIdade()
				+ ", situacao=" + p.getSituacao() + "]";
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	
	
}
