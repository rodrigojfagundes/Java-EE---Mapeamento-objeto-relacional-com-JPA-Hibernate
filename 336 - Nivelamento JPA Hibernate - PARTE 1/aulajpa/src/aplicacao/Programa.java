package aplicacao;

import dominio.Pessoa;

//criando a classe programa
public class Programa {

	public static void main(String[] args) {
		
		//instanciando um objeto do TIPO PESSOA... Ou seja estamos chamando a CLASSE
		//Pessoa e passando alguns valores para os ATRIBUTOS/VARIAVEIS ID, NOME, EMAIL
		//e chamando esse OBJETO do tipo PESSOA de P1...	P2 e P3 tbm são
		
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmail.com");
		
		Pessoa p2 = new Pessoa(2, "Joaquim Torres", "joaquim@gmail.com");
		
		Pessoa p3 = new Pessoa(3, "Ana Maria", "ana@gmail.com");
		
		
		//imprimindo as PESSOA na tela... Nesse momento ele vai no OBJETO P1,P2 e P3
		//e chama o METODO TOSTRING e imprime o valor
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
