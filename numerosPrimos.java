package br.zup.discovery.academy.josias.utils;

public class numerosPrimos {

	public numerosPrimos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//operacao

		for (int i = 1; i <= 1000; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }
            if (counter == 2) {  //condicao
                System.out.println(" O numero é  " + i++);
            }
        }
    }
}	
					
					

		
	

	
	

		
			



