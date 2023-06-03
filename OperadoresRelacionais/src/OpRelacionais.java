
public class OpRelacionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		String n3;
		
		n1 = 10;
		n2 = 11;
		
/*========== aqui temos um aninhamento e note que no aninhamento em em testes condicionais
 * na primeira condição atendida o codigo para e exibe o resulatado, 
 * */
		// inicio teste condicional com aninhamento
		if(n1 == n2) {
			System.out.println("n1 e n2 são iguais");
			
		}else if(n1 !=n2) {
			System.out.println("n1 e n2 não são iguais");
				}else if(n1 < n2) {
					System.out.println("n1 é menor que n2 ");
					    }else if(n1 > n2) {
					        System.out.println("n1 é maior que n2 ");
					        }
	
			// inicio do teste condicional sem aninhamento
			n1=10; n2=11;
			if(n1 < n2) {
				System.out.println("n1:"+n1+" e "+"n2:"+n2+" n1 é menor que n2 ");
			} 
			
			n1=11; n2=10;
			if(n1 > n2) {
				System.out.println("n1:"+n1+" e "+"n2:"+n2+" n1 é maior que n2 ");
			}
			
			if(n1 != n2) {
				System.out.println("n1:"+n1+" e "+"n2:"+n2+" n1 é diferente de n2 ");
			}
			
			n1=10; n2=10;
			if(n1 == n2) {
				System.out.println("n1:"+n1+" e "+"n2:"+n2+" n1 é igual à n2 ");
			}
			
			for(int i = 1;i<=6;i++) {
					n1= i;
					n2 = 5;
					if(n2<n1) {
						System.out.println("n2=="+n2+" é menor que n1==" + i);		
					}
					if(n2 != n1) {
						System.out.println("n2=="+n2+" é diferente de n1==" + i);		
					}
					if(n2 == n1) {
						System.out.println("n2=="+n2+" é igual a n1==" + i);		
					}
					if(n2 > n1) {System.out.println("n2=="+n2+" é maior que n1==" + i);		}
					
			}
			}
		}
	



