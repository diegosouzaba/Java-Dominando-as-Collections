package dominando_as_collections;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "modelando a classe aula";
		String aula3 = "trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		aulas.remove(0);
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula e :"+primeiraAula);
		
		for(int i = 0;i < aulas.size();i++) {
			
			System.out.println("aula :"+ aulas.get(i));
			
		}
		
		aulas.forEach(aula ->{System.out.println("Percorrendo :"+ aula);});
		

	}

}
