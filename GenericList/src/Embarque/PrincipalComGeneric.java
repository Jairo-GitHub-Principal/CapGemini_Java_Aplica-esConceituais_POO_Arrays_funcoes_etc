package Embarque;

import java.util.Scanner;

import Controle.Aeronave;
import Controle.AeronaveComGeneric;

public class PrincipalComGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		// mudamos o tipo da instancia desse objeto para string testar o comportamento do genericT 
		AeronaveComGeneric<String> air = new AeronaveComGeneric<>(); 
		

		System.out.println("_______________________________String___________________________________");
		System.out.println("Informe o numero de aeronaves tipo T que vão decolar");
		int nrAeronave = sc.nextInt();
		System.out.println("numero de aeronave T_String pra decolar: "+nrAeronave);
		for (int i = 0; i < nrAeronave; i++) {
			System.out.println("o I esta valendo: "+ i);
			
			System.out.println("Informe o numero do Voo da aeronave T n° "+ (i+1));
			int entrada = sc.nextInt(); 
			String nrVoo = Integer.toString(entrada);// alternar entre Integer e String para ver o comportamento do generic list
			air.addVoo(nrVoo);
			
			System.out.println("__________________________________________________________________");
		}
		
		String x = (String) air.primeiroVoo();
		System.out.println("O primeiro a decolar vai ser o nr: "+ x);
		
		System.out.println("abaixo temos a lista de todos os Voos  tipos T_String que vao decolar");
		air.listarVoos();
		sc.close();
		
		

	}

}
