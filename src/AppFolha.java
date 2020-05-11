import model.Diretor;
import model.Funcionario;

public class AppFolha {
	public static void main(String args[]) {
		
		Funcionario f = new Funcionario("Guilherme","gbermudes@gmail.com",1000.0f);
		Diretor		d = new Diretor("Zezinho","zezinho@gmail.com",5000.0f,800.0f);
		
//		f.setNome("Guilherme");
//		f.setEmail("gbermudes@gmail.com");
//		f.setSalario(1000.0f);
		
//		d.setNome("Zezinho");
//		d.setEmail("zezinho@gmail.com");
//		d.setSalario(20000.0f);
//		d.setBeneficio(900.0f);
		
		f.imprimirInfo();
		
		System.out.println(f.imprimirInfo());
		System.out.println(d.imprimirInfo());
		
		d.imprimirInfo();
		
	}
}
