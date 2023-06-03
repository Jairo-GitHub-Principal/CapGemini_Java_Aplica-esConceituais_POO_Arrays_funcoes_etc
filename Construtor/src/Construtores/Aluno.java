package Construtores;

import java.io.ObjectInputFilter.Status;

public class Aluno {
	
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno; // nessa linha o enum STATUS recebeu o nome de situacaoAluno, e por esse nome ele sera invocado em outras 
						  // classes e atravez do nome STATUS sera feito a auternacia entre os valores, predefinidos para essa propriedade	
	public Aluno (double nota1, double nota2, double nota3) {
		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
	}
	
	// abaixo temos uma forma de implementar uma lista de valores constantes, do tipo enum "pesquise sobre o conceito de enum java"
	public enum STATUS{ //aqui criamos uma propriedade de lista de valores constantes, do tipo enum,essa propriedade esta sendo, chamada de situacaoAluno junto nas propriedades de alunos
		APROVADO,
		REPROVADO
	}
	
	public double calcularMediaAluno() {
		double mediaAluno=0;
		mediaAluno =(this.nota1 +this.nota2+this.nota3)/3;
		return mediaAluno;
	}
	
	
	
}
