package fr.springmaths.matt;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMatt {
	
	//on va pouvoir récupérer les intances de nos objets à partir de là
	private static ApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context = new ClassPathXmlApplicationContext("app-context.xml");
	}
	
	@Test
	public void testFactorielle(){
		//on utilise l'interface
		Matt matt = (Matt)context.getBean("matt"); //on va récupérer le bean matt et on référence l'implémenteur
		int resultFacto = matt.factorielle(5);
		boolean resultPrime=matt.prime(7); //on va bien tester le bean qui a été récupéré via sa référence "matt"
		int resultLapin=matt.lapin(12); //144
		
		//on fait une assertion pour le test:
		
		assertEquals(120,resultFacto);
		assertEquals(144,resultLapin);
		assertEquals(true,resultPrime);
		
	}

}
