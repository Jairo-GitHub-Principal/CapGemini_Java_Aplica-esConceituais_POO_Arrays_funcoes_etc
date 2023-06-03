package AulaAnotations;



public class DeprecatedTeste {
	void visualizar() {
		System.out.println("metodo visualização");
	}
	
	@Deprecated
	void exibir(){
		
		System.out.println("mostrando que o metodo exibir é normal");
	}
}
