
public class Polimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero mElefante = new Elefante();
		Mamifero mRato = new Rato();
		
		System.out.println("cota diaria de leito do elefante é: "+ mElefante.CotaDiariaLeite());
		System.out.println("cota diaria de leite do rato é: " + mRato.CotaDiariaLeite() );
		
		
	}

}
