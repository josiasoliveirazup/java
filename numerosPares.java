package br.zup.discovery.academy.josias.utils;

public class numerosPares {

	public numerosPares() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 1000; i++) {     //operacao 
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }								//condicao	
            if (i %2 == 0) {
                System.out.println(" O numero é  " + i++);
            }
        }
    }
}	
	
	


