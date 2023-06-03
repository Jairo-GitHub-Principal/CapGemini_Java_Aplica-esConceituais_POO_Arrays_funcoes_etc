import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> carros = new ArrayList<>(); // instanciand um arraylist monotipado "String"
		
		carros.add("FLUENCE");
		carros.add("KOMBI");
		carros.add("JAGUAR");
		carros.add("BMW");
		carros.add("MERCEDES");
		carros.add("FUSCA");
		carros.add("VECTRA");
		
		System.out.println(carros);
		
		// substituir um carro por outra na lista
		carros.set(4,"MITSUBISH"); // 4 é a posição e "mitsubish" é o valor que substituira o valor da posição 4 do arraylist carros
		System.out.println(carros);
		
		// pegar um valor especifico no array 
		String c = carros.get(1); // pegar pela posição
		String c1 = carros.get(0);
		System.out.println(c+" "+c1);
		
		// remover um carro da lista 
		carros.remove(6); // remover carro informando a posição do mesmo no array_posição informada remove o VECTRA
		//carros.remove("FUSCA"); // remover carro informando o nome do mesmo no array
		System.out.println(carros);
		
		// add carro ao arrayList com joptionPane
		
		carros.add(JOptionPane.showInputDialog("adicionar um carro: ").toUpperCase());//pega testo digitado e transforma para maiuscula e add no array carros
		System.out.println(carros);
		
		// pesquisar um carro pelo nome dentro do array
		
		boolean achei = false;
		int num = 0;
		String substituir= JOptionPane.showInputDialog("substituir o carro?").toUpperCase();
		if(carros.contains(substituir)) {// pergunta se no array carros contem un carro com o nome "BMW" caso sim, o arrayList sera percorrido pelo for para encontrar o carro e sua posição
			for(int i = 0;i<carros.size();i++) { // iteração para percorrer o array carros
				if("BMW".equals(carros.get(i))) { //determina que quando o BMW na posição "i" for encontrado eu faço com ele o que manda o comando abaixo
					carros.set(i,JOptionPane.showInputDialog("carro para substituir o carro pesquisado").toUpperCase());//redefinirei o nome do carro, por outro informado via teclado
					System.out.println("carro "+ carros.get(i)+" esta na posição: "+i); // imprime o carro que eu enseri e a posição que ele esta
					achei=true;
					num = i;
					break; // interrompe a iteração, ja que não preciso mais percorrer o arraylist para encontrar o carro
					
				}
			}
			if(achei) {
				System.out.println("encontrei o carro "+substituir+ " na posição "+num+" e substitui por "+ carros.get(num));
			}else {
				System.out.println("o carro " +substituir+ " não foi encontrado");
			}
		}
		
		
		
		// ver o tamanho do array
		
		System.out.println("tamanho do array: "+ carros.size());
	

		// esvaziar o array
		//carros.clear();
		System.out.println(carros);
		
		if(carros.isEmpty()) {
			System.out.println("o vetor esta vazio");
		}
		
	
		
		
	}

}
