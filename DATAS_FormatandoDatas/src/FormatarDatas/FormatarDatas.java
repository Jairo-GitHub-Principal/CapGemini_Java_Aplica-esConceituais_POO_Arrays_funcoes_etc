package FormatarDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class FormatarDatas {

	public static void main(String[] args)  throws ParseException{
		// TODO Auto-generated method stub
		
		
		// calendar para pegar uma data do sistema ou outro formato de dadta especifico
		Calendar Calendario =Calendar.getInstance(); // instancia de uma classe do tipo Calendar
		Date datCalendario = Calendario.getTime();
		
		// Simple date formt para formatar o data para um formato especifico
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		// Criar uma instancia para entrada de dados
		Scanner entrada = new Scanner(System.in); // instancia da classe scanner para entrada de dados
		
		
		
		System.out.println("digite uma data com ano mês e dia");
		
		String dat = entrada.nextLine();
		//String dataTeste="1979/24/11"; // equivale a data digitada
		//String dat = dataTeste;
		System.out.println("Data digitada: "+dat);
		//--------------------para que a linha de a linha que converte o tipo de data e a linha que formata a data funcione,é exencial:
		// Que na assinatura do metodo cujo escopo foi implementado o codigo de conversão e formatação
		// tenha a seguinte declaração: "throws ParseException"
		Date dataConvertida = sdf.parse(dat); // convert para o tipo new date dia do mes dia da semana mês ano hora etc
		
		String datFormatada = sdf.format(datCalendario); // formata a data para um formato especifico, nesse caso pegamos a data do sistema e convertemos para um formato de  dd/mm/yyyy
		
		System.out.println("Tipo new Date "+dataConvertida);
		
		System.out.println("Data formatada dd/mm/yyyy: "+datFormatada);
		
		

	}

}
