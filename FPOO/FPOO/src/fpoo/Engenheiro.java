package fpoo;

public class Engenheiro extends Funcionario{
	int numCrea;

	public Engenheiro(String nome, String matricula, String telefone, String endereco, String dataNascimento,
			double salario, int numCrea) {
		super(nome, matricula, telefone, endereco, dataNascimento, salario);
		this.numCrea = numCrea;
	}

	public int getNumCrea() {
		return numCrea;
	}

	public void setNumCrea(int numCrea) {
		this.numCrea = numCrea;
	}
	
	

}
