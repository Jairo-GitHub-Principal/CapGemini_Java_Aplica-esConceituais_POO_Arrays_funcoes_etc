
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		// while ou enquanto
		
		int qtdVezes = 1;
		
		while(qtdVezes <= 10) { // testa no inicio
			System.out.println("Estou fazendo while "+qtdVezes+"º vez");
			qtdVezes++;
		}
		System.out.println("Sai do laço de repetição e executei " +(qtdVezes-1)+ " vezes \n");
		
		
		qtdVezes=1;// estou voltando a variavel qtd... para 1, 
		do {// laço pré testado
			
				System.out.println("Estou fazendo do while "+qtdVezes+"º vez");
				qtdVezes++;
			
		}while(qtdVezes <=10);
		System.out.println("Sai do laço de repetição e executei " +(qtdVezes-1)+ " vezes \n");
		
		
		
		// for
		int i= 1;
		for ( i = 1;i<=10;i++) {
			
			System.out.println("Estou fazendo  for "+i+"º vez");
			
		}
		System.out.println("Sai do laço de repetição for e executei " +(i-1)+ " vezes \n");
		
		
		
		// for com interrupção do loop
				for (i = 1; i <=10; i++) {
			System.out.println("Estou fazendo  for "+i+"º vez");
			if(i == 5) {
				System.out.println("Sai do laço de repetição for pelo break e executei " +i+ " vezes \n");
				break;
			}
		}
		}
}
