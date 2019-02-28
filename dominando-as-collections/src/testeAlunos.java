import java.util.HashSet;
import java.util.Set;


public class testeAlunos {
	public static void main(String[] args) {
		
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Diego souza");
		alunos.add("joao souza");
		alunos.add("junio souza");
		alunos.add("souza");
		alunos.add("joao vieira");
		alunos.add("van souza");
		
		
		boolean pem = alunos.contains("paulo");
		System.out.println(pem);
		
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		
		System.out.println(alunos);
	}

}
