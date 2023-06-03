import javax.swing.JOptionPane;

public class Array_implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	 int[] num = new int[4]; // vetor
	 int[][] num1 = new int[4][4];// matriz
JOptionPane.showMessageDialog(null,"digite um numero qualquer");

for(int i =0; i<4;i++) {
	String n= JOptionPane.showInputDialog(null); // declarei uma variavel, e atribuo a ela o valor capturado por um JOptionPane.Input
	num[i]= Integer.parseInt(n); // passo a converter todo valor que for capturado pelo JOptionPane, e atribuido a variavel n, e adiciono em uma determinada posição "i" do meu vetor num
	System.out.println(num[i]); // imprimo o valor digitado pelo usuario, que foi armazenado na posição i do vetor
	JOptionPane.showMessageDialog(null,num[i]);
}


	 
		
		
		
		

	}

}
