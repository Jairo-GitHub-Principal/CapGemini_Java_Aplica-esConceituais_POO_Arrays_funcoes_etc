import javax.swing.JOptionPane;

public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		PessoaFisica pesFisica =new PessoaFisica();
		PessoaJuridica pesJuridica =new PessoaJuridica();
		
		
		
		JOptionPane.showMessageDialog(null,"dados de pessoa fisica:");
		pesFisica.setNome(JOptionPane.showInputDialog("Nome: "));
		pesFisica.setCpf(JOptionPane.showInputDialog("Cpf: "));
		pesFisica.setSituacao(JOptionPane.showInputDialog("situação: "));
		pesFisica.setIdentidade(JOptionPane.showInputDialog("RG: "));
		pesFisica.setIdade(Integer.parseInt( JOptionPane.showInputDialog("idade: ")));
		
		
		JOptionPane.showMessageDialog(null,"dados de pessoa Juridica:");
		pesJuridica.setNome(JOptionPane.showInputDialog("Nome: "));
		pesJuridica.setCnpj(JOptionPane.showInputDialog("Cnpj: "));
		pesJuridica.setSituacao(JOptionPane.showInputDialog("situação: "));
		pesJuridica.setInscEstadual(JOptionPane.showInputDialog("inscrição estadual: "));
		pesJuridica.setIdade(Integer.parseInt( JOptionPane.showInputDialog("idade: ")));
		
		
		System.out.println("dados da pessoa juridica");
		System.out.println(pesFisica.toString());
		
		System.out.println("dados da Pessoas fisica");
		System.out.println(pesJuridica.toString());
		
		
		
		
	}

}
