package Embarque;

import java.util.Scanner;

import Controle.AeronaveComGeneric;

public class PrincipalComGeneric2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner sc = new Scanner(System.in);
		
		// mudamos o tipo da instancia desse objeto para string testar o comportamento do genericT 
		AeronaveComGeneric<Double> air = new AeronaveComGeneric<>(); 
		

		System.out.println("________________________________Double__________________________________");
		System.out.println("Informe o numero de aeronaves tipo T_Double que vão decolar");
		int nrAeronave = sc.nextInt();
		System.out.println("numero de aeronave T pra decolar: "+nrAeronave);
		for (int i = 0; i < nrAeronave; i++) {
			System.out.println("o I esta valendo: "+ i);
			
			System.out.println("Informe o numero do Voo da aeronave T_Double n° "+ (i+1));
			int entrada = sc.nextInt(); 
			Double nrVoo = Double.valueOf(entrada);// alternar entre Integer e String para ver o comportamento do generic list
			air.addVoo(nrVoo);
			
			System.out.println("__________________________________________________________________");
		}
		
		Double x = (Double) air.primeiroVoo();
		System.out.println("O primeiro a decolar vai ser o nr: "+ x);
		
		System.out.println("abaixo temos a lista de todos os Voos  tipos T_Double que vao decolar");
		air.listarVoos();
		sc.close();
		

	}

}
