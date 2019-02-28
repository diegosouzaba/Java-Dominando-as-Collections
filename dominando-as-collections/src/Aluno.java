import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Aluno {
	
	private String nome;
	private int nomeroMatricula;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	
	
	public Aluno(String nome, int i) {
		super();
		this.nome = nome;
		this.nomeroMatricula = i;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNomeroMatricula() {
		return nomeroMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nomeroMatricula=" + nomeroMatricula
				+"]";
	}
	
	
	
	

}
