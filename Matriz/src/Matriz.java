import java.util.Iterator;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String [] aluno = {"JOAO","JOSE","MARIA"}; // declaração de vetor 3 coluna cheio
		
		float [][] notas = new float[3][4]; // declarando matriz 3 linhas e 4 colunas
		
		
		float somaNotas,mediaAluno; 
		String statusAluno;
		
		for( int i=0;i<3;i++) {
			System.out.println("aluno: "+aluno[i]);
			somaNotas=0;
			mediaAluno=0;
			
			for(int j =0;j<4;j++) {
				notas[i][j]=Float.parseFloat(JOptionPane.showInputDialog("informe a NOTA n° "+(j+1)+" do aluno "+aluno[i]));
				somaNotas=somaNotas+notas[i][j];
				}
			mediaAluno=somaNotas/4;
			
			if(mediaAluno<5.5) {
				statusAluno="REPROVADO";
			}else if (mediaAluno>=5.5 && mediaAluno<=7.5) {
				
				statusAluno="EM RECUPERAÇÃO";
			}else {statusAluno="APROVADO";}
			
			
			System.out.println("\n*****************BOLETIM********************");
			System.out.println("aluno "+aluno[i]);
			System.out.println("NOTAS");
			
			for (int j1 = 0; j1 < 4 ; j1++) {
				System.out.println((j1+1) +" - "+notas[i][j1]);
			}
			System.out.println("MEDIA ..:" +mediaAluno+ " - " + statusAluno);
			System.out.println("\n*****************FIM_BOLETIM********************");
		}
		
		
		
		
		
		
	}
}
