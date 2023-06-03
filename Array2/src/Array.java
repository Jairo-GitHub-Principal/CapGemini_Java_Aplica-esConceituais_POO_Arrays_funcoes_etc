import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[5];
		String[]nome=new String[5];
		
		for(int i =0; i<5;i++) {
			// num=new int[5]; // redefinir o tamanho do array
			num[i]=Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
			System.out.println("numero: "+num[i]+"_posição_"+ i);
		}
		
		
		for(int i =0; i<5;i++) {
			// num=new int[5]; // redefinir o tamanho do array
			
			nome[i]=JOptionPane.showInputDialog("digite um nome");
			System.out.println("nome: "+nome[i]+"_posição_"+ i);
			
		}
		
		
		// listar o conteudo do array com forEsch
		System.out.println("_____________________________________________________________\n");
		for (String lista : nome) { //essa extrutura forEach usada aqui, é padrão no java 8 e versões anteriores, a partir do java 8, temos uma extrutura do forEach de forma literal, ou seja: forEach(String item: items){} 
			
			System.out.println("nome: "+lista);
		}
		
		
		
		
		
		

	}

}
