package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

//criando a classe programa
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
		
		
		//o OBJETO P do tipo PESSOA, vai receber o metodo FIND do EM (ENTITY MANAGER)
		//e para ele (metodo FIND) nos vamos pedir para BUSCAR/PEGAR a PESSOA de ID 2
		//e armazenar essa PESSOA no OBJ P
		Pessoa p = em.find(Pessoa.class, 2);
		
		//iniciando uma TRANSACAO com o BANCO
		em.getTransaction().begin();
		
		//chamando o metodo REMOVE do ENTITYMANAGER e passando a PESSOA P
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.print("pronto");
	}

}
