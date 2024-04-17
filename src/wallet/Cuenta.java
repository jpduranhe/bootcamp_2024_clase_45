package wallet;

public class Cuenta {
	
	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	
	public boolean depositar(double monto) {
		this.saldo+=monto;
		
		return true;
	}
	
	public boolean retirar(double monto) {
		if(monto>this.saldo) {
			return false;
		}
		
		this.saldo-=monto;
		return true;
	}
	
	
	public double getSaldo(){
		return this.saldo;
	}

}
