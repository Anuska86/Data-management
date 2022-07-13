package vector;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer>vector= new ArrayList<Integer>(); //1
		
		int nr_par=0; //2
		int nr_impar=0; //3
		int i=0; //4
		
		while (i<vector.size()) { //5
			if (vector.get(i)%2==0) { //6
				nr_par++; //7
			}
			else { //8
				
				nr_impar++; //9
			i++; //10

		}
			System.out.println("nr_par " + nr_par); //11
			System.out.println("nr_impar " + nr_impar); //12
		}
		
	}
	
	
}