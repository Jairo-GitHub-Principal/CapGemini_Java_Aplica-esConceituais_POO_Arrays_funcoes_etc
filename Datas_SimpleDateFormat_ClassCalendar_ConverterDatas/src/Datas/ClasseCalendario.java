package Datas;

import java.util.Calendar;

public class ClasseCalendario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// recuperar data com a classe calendar
		System.out.println("Recuperar a data com a classe calendar");
		Calendar cal = Calendar.getInstance();
		System.out.println("data e hora atual: "+ cal.getTime()+"\n");
		
		System.out.println("ano " +cal.get(Calendar.YEAR) );
		System.out.println("dia do mês "+cal.get(Calendar.DAY_OF_MONTH));
		
		
		System.out.println("\n_________________________________________________\n");
		System.out.println("Alterar a data e hora com metodo set \n");
		
		cal.set(Calendar.DAY_OF_MONTH, 31); // alterar data:  seto o dia para o dia 31
		cal.set(Calendar.YEAR,2040);  // alterar data: seto o ano para 2040
		System.out.println("Data/Hora atual: " + cal.getTime());// o valor de ano e o dia que aparecera  aqui sera o valor setado no codigo acima
		
		
		System.out.println("Ano: " + cal.get(Calendar.YEAR)); // aqui estamos apenas imprimindo somente o ano, que setamos na linha 23
		
		System.out.println("\n_________________________________________________\n");
		
		System.out.println("recuperando a hora do dia");
		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.HOUR,9);  // alterar a hora para testar as saldações 
		int hora = cal1.get(Calendar.HOUR_OF_DAY);
		System.out.println("agora são: " + hora + "hrs");
		if(hora > 6 && hora < 12) {
			System.out.println("Bom dia");
		}else if(hora > 12 && hora <18) {
			System.out.println("Boa tarde");
			}else {	
				System.out.println("Boa noite");
				}
		System.out.println("");
		
		
		
		
		

	}

}
