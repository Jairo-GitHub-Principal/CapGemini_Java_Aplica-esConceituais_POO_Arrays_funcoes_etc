import javax.swing.JOptionPane;

public class ExtruCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n1=10,n2=5;
		if (n1 < n2) {
			
		} else {

		}
		
		if (n1 > n2) {
			
		} else if(n1 < n2) {

		}else { // se não é maior e nem menor aqui se enquadrara a condição de igual
			
		}
		
		
		
		String n = JOptionPane.showInputDialog(null);
	
		switch(n) {
		
		case "1":{      
			System.out.println("inclusão");
			
			break;}
		case "2":{      
			System.out.println("alteração");
			break;}
		case "3":{      
			System.out.println("exclusão");
			break;}
		case "4":{      
			System.out.println("consulta");
			break;}
		default:{
			JOptionPane.showMessageDialog(null,n+" é um numero invalido");
			System.out.println("opção invalida");
			break;}
		}
			
		}
	
		
		
	   
	}


