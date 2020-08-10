package br.zup.discovery.academy.josias.utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomaPrecoProdutos {

	public SomaPrecoProdutos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Produto p1 = new Produto();
		p1.preco = 10;

	Produto p2 = new Produto();
	p2.preco = 30;

	List<Produto> produtos = Arrays.asList(p1, p2); 

	Integer somaPrecoProdutos = p1.preco + p2.preco; //operacao
	System.out.println("O valor dos produtos é " +somaPrecoProdutos);

}

static class Produto {
		Integer preco;
}


	}


