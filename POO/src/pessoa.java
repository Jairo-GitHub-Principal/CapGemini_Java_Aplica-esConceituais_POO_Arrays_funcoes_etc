import java.lang.reflect.Constructor;

public class pessoa {
	
	public String nome;
	public int idade;
	
	
	public pessoa() {
		nome="";
		idade=0;
	}
	
	// metodo sem retorno "void" vazio
	public void mostrarDados(String n,int i){
		
		System.out.println("nome: "+ n);
		System.out.println("idade: "+ i);
		
	} 
	
	
	
}
