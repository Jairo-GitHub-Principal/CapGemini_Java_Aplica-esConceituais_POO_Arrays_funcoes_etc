package AulaAnotations;

import java.lang.annotation.Inherited;

public class TesteAnotations {
	
	public static void main(String[]args) {
		
		DeprecatedTeste dep = new DeprecatedTeste();
		
		dep.visualizar();
		
		dep.exibir();
	}
}
