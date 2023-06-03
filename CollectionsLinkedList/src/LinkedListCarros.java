import java.util.LinkedList;

import javax.swing.JOptionPane;

public class LinkedListCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  addFirst()
		  addLast()
		  removeFirst()
		  removeLast()
		  getFirst()
		  getLast()
		  
		 */
		
		
		LinkedList<String> carros = new LinkedList<String>();
		
		for(int i = 0; i<3;i++) { // adicionando carros na linked list
			carros.add(JOptionPane.showInputDialog("digite o carro da posição "+i+" da lista").toUpperCase());
			
		}
		System.out.println("carros adicionados: "+ carros);
		
		// adicionar no começo da lista                                  apos o "," o texto digitado entre"" sera um placeholder  
		carros.addFirst(JOptionPane.showInputDialog("adicionar carro: ","no começo da lista" ).toUpperCase());
		System.out.println("carros adicionados: "+ carros);
		
		// adicionar no fim da lista
		carros.addLast(JOptionPane.showInputDialog("adicionar um  carro no fim da lista").toUpperCase());
		System.out.println("carros adicionados: "+ carros);
		
		// pegar um carro no inicio da lista
		String carInicioList = carros.getFirst();
		System.out.println("o carro encotrado no inicio da lista é: " +carInicioList);

		//pegar um carro no meio da lista
		int carroQantidade = carros.size();
		
		int meioDaLista = carroQantidade/2;
		
		System.out.println("tamanho do array= "+carroQantidade+" o meio do array esta proximo de "+carroQantidade+ " / 2= "+meioDaLista);
		
		String carMeiList = carros.get(meioDaLista);
		System.out.println("o carro encotrado na posição tamanho do array / 2 é "+"("+ carMeiList +")"+ " encontrado n posição "+meioDaLista);
		
		// pegar um carro no fim da lista
		String carFimList = carros.getLast();
		System.out.println("o carro encotrado no fim da lista é: "+ carFimList);
		
		// pegar um carro atravez de uma posição expecifica
		int num = Integer.parseInt(JOptionPane.showInputDialog("digite um nume que de 1 a 4"));
		if(num < carros.size()) {
		String carPositEspecifique = carros.get(num);
		System.out.println("o carro encotrado na posição "+num+" do array é o: "+ carPositEspecifique);
		}else {
			System.out.println("posição " +num+ " não existe no array");
		}
		
		// remover o primeiro carro da lista
		System.out.println("carro removido do inicio da lista: "+ carros.removeFirst());
		System.out.println(carros);
		
		// remover um carro do final da lista
		System.out.println("carro removido do final da lista: "+ carros.removeLast());
		System.out.println(carros);
		
		// limpar array linkedList
		carros.clear();
		
		if(carros.isEmpty()) {
			System.out.println("LinkedList vazio! " + carros);
		}
		
		
	}

}
