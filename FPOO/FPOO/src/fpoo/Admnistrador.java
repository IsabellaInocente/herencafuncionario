package fpoo;

public class Admnistrador extends Funcionario {
	int cra;

	public Admnistrador(String nome, String matricula, String telefone, String endereco, String dataNascimento,
			double salario, int cra) {
		super(nome, matricula, telefone, endereco, dataNascimento, salario);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}
	
	

}
