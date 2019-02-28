
public class testaCursoComAluno {
public static void main(String[] args) {
	
	Curso javaColecoes = new Curso("Dominando as coleçoes do java", "Diego souza");
	javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
	javaColecoes.adiciona(new Aula("Criando uma aula",20));
	javaColecoes.adiciona(new Aula("Modelando com coleçoes",24));
	
	Aluno a1 = new Aluno("Rodrigo", 321654);
	Aluno a2 = new Aluno("Diego", 651654);
	Aluno a3 = new Aluno("joao", 121654);
	
	javaColecoes.matricula(a1);
	javaColecoes.matricula(a2);
	javaColecoes.matricula(a3);
	
	System.out.println("Todos os alunos matriculados");
	javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
	
}
}
