package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		//criando um OBJETO chamado EMF que é um OBJETO do tipo ENTITYMANAGERFACTORY
		//e para ele nos vamos chamar o METODO CreateEntityManagerFactory e passar o valor
		//EXEMPLO-JPA... Pois é o NOME/APELIDO q foi dado para a CONEXAO ao BANCO, q esta 
		//no arquivo PERSISTENCE.XML dentro de "src/main/resources"/META-INF
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

		//o ENTITYMANAGER serve para fazer as ALTERAÇOES no 
		//BANCO... ADD, LER, EDIT, REMOVE, etc...
		EntityManager em = emf.createEntityManager();
		
		//criando um OBJETO do tipo PESSOA chamado P, q vai receber o RETORNO do metodo
		//FIND do EM (EntityManager)... e o METODO FIND vai PROCURAR no BANCO e retornar
		//uma PESSOA... no CASO é a PESSOA do ID 2
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		
		System.out.print("pronto");
	}

}
