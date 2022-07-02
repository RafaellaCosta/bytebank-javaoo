
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(3422, 333);
		conta.depositar(232);
		
		Conta conta3 = new Conta(234, 345);
		conta3.getSaldo();
		
		System.out.println(Conta.getTotal());
		
	}
	
}
