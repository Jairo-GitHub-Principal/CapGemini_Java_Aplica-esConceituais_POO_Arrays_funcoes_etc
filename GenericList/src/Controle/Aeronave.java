package Controle;

import java.util.ArrayList;
import java.util.List;

public class Aeronave {
	
	private List<Integer> listaAeronaves = new ArrayList<>();
	
	public void addVoo(Integer nrVoo) {
		listaAeronaves.add(nrVoo);
	}
	
	public Integer primeiroVoo() {
		if(listaAeronaves.isEmpty()) {
			throw new IllegalStateException("list id empyt");
		}
		return listaAeronaves.get(0);
	}
	
	public void listarVoos() {
		System.out.println("[");
		if(!listaAeronaves.isEmpty()) {
			System.out.println(listaAeronaves.get(0));
		}
		for (int i = 1; i < listaAeronaves.size(); i++) {
			System.out.println(" "+ listaAeronaves.get(i));
			
		}
		
		System.out.println("]");
		
	}
}
