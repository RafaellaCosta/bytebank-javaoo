
public class TestaGetESet {
	public static void main(String[] args) {

		Conta contaLucas = new Conta(123, 45);
		System.out.println(contaLucas.getAgencia());
		
		Conta contaRafa = new Conta(4546, 98);
		System.out.println(contaRafa.getAgencia());
		
		contaRafa.depositar(23);
		System.out.println(contaRafa.getSaldo());
		
		contaLucas.depositar(1000);
		System.out.println(contaLucas.getSaldo());
		contaLucas.saca(200);
		System.out.println(contaLucas.getSaldo());
		
		contaLucas.transfere(50, contaRafa);
		System.out.println(contaRafa.getSaldo());
		
		contaLucas.setNumero(100);
		System.out.println(contaLucas.getNumero());
		
		Cliente rafaella = new Cliente();
		
		contaLucas.setTitular(rafaella);
		rafaella.setNome("Rafaella Costa");
		System.out.println(contaLucas.getTitular().getNome());
		
		rafaella.setCpf("345.543.678-98");
		System.out.println(rafaella.getCpf());
		
		rafaella.setProfissao("Engenheira de software");
		System.out.println(rafaella.getProfissao());
		
		Cliente lucas = new Cliente();
		contaLucas.setTitular(lucas);
		lucas.setNome("lucas Costa");
		System.out.println(contaLucas.getTitular().getNome());
		
		lucas.setCpf("235.523.678-98");
		System.out.println(lucas.getCpf());
		
		lucas.setProfissao("Engenheiro de software");
		System.out.println(lucas.getProfissao());

		
	}
}
