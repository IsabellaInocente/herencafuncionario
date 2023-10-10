package fpoo;

public class Objeto {
	public static void main(String[] args) {
	
	Funcionario funcionario = new Funcionario("Mike", "50215369","15 99857401", "rua tekma", "14/05/1999", 15.000);
	System.out.println("Funcionario");
	System.out.println("nome"+ funcionario.getNome());
	System.out.println("matricula"+ funcionario.getMatricula());
	System.out.println("telefone"+ funcionario.getTelefone());
	System.out.println("endereco"+ funcionario.getEndereco());
	System.out.println("dataNascimento"+ funcionario.getDataNascimento());
	System.out.println("salario"+ funcionario.getDataNascimento());
	
	Admnistrador administrador = new Admnistrador(42018);
	System.out.println("Admnistrador");
	System.out.println("cra"+ administrador.getCra());
	
	Engenheiro engenheiro = new Engenheiro(54120);
	System.out.println("Engenheiro");
	System.out.println("numcra"+ engenheiro.getNumCrea());
	
	Medico medico = new Medico(00258);
	System.out.println("Medico");
	System.out.println("crm"+ medico.getCrm());
	
	

}
}
