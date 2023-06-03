import java.security.PublicKey;

public class Carro {
	protected String marca;
	protected String cor;
	
	public Motor motor = new Motor();
	
	
	protected Motor ligar() {		
		 this.motor.darPartida();
		 return this.motor;
		 
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", motor=" + motor.potencia + "]";
	}

	
	
}
