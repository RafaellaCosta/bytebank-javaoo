
public class Conta {

	
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static é da classe
    private static int total;
    
    public Conta(int agencia, int numero) {
    	
    	Conta.total++;
    	this.agencia = agencia;
    	this.numero = numero;
    }
    
    
    public void depositar(double valor) {
    	if(valor > 0) {
    		this.saldo += valor;
    	}
    }
    
    
    public boolean saca(double valor) {
    	if(valor > 0 && this.saldo >= valor) {
    		this.saldo -= valor;
    		return true;
    	}
        return false;
	}
    
    
    public boolean transfere(double valor, Conta destino) {
    	if(valor > 0 && this.saldo >= valor) {
    		saca(valor);
    		return true;
    	}
    	return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }  
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}
    
    public static int getTotal() {
    	return Conta.total;
    }
}
  
