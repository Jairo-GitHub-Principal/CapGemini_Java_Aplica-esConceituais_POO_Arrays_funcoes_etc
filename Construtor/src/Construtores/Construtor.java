package Construtores;

import Construtores.Aluno.STATUS; // importando a propriedade status na classe  aluno
public class Construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno alu = new Aluno(6, 5, 5);
		
		double mediaAluno=alu.calcularMediaAluno();
		
		if(mediaAluno < 6) {alu.situacaoAluno =STATUS.REPROVADO;
		
		}else {
			alu.situacaoAluno =STATUS.APROVADO; 
		}
			
		System.out.println("a media do aluno é: "+alu.calcularMediaAluno()+", e o status do aluno é: "+alu.situacaoAluno);
	}

}
