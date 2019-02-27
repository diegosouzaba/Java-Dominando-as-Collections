package dominando_as_collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "modelando a classe aula";
		String aula3 = "trabalhando com cursos e sets";
		String aula4 = "A ";
		String aula5 = "B ";
		String aula6 = "C ";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		aulas.add(aula5);
		aulas.add(aula6);
		
		
		System.out.println(aulas);
		aulas.remove(0);
		System.out.println("\n\n\n\n");
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula e :"+primeiraAula);
		System.out.println("\n\n\n\n");
		
		for(int i = 0;i < aulas.size();i++) {
			
			System.out.println("aula :"+ aulas.get(i));
			
		}
		System.out.println("\n\n\n\n");
		
		aulas.forEach(aula ->{System.out.println("Percorrendo :"+ aula);});
		System.out.println("\n\n\n\n");
		
		Collections.sort(aulas);
		System.out.println(aulas);
		

	}

}
