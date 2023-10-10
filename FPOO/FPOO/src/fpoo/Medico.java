package fpoo;

public class Medico extends Funcionario{
	int crm;

	public Medico(String nome, String matricula, String telefone, String endereco, String dataNascimento,
			double salario, int crm) {
		super(nome, matricula, telefone, endereco, dataNascimento, salario);
		this.crm = crm;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	

}
