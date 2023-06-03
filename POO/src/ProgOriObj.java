import javax.swing.JOptionPane;

public class ProgOriObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pessoa pes =new pessoa(); // instancia da classe pessoa
		
		 pes.nome=JOptionPane.showInputDialog("digite seu nome:");
		pes.idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade:"));
		
		pes.mostrarDados(pes.nome, pes.idade);
		

	}

}
