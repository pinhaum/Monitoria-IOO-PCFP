package aps1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.After;
import org.junit.Before;

class ContaCorrenteTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testGetNumero()
    {
        ContaCorrente contaCor1 = new ContaCorrente();
        contaCor1.setNumero(569);
        assertEquals(569, contaCor1.getNumero());
    }

    @Test
    public void testGetVerificador()
    {
        ContaCorrente contaCor1 = new ContaCorrente();
        contaCor1.setNumero(235);
        assertEquals(235, contaCor1.getNumero());
        assertEquals(0, contaCor1.getVerificador());
    }

    @Test
    public void testGetVerificadorDois()
    {
        ContaCorrente contaCor1 = new ContaCorrente();
        contaCor1.setNumero(738);
        assertEquals(4, contaCor1.getVerificador());
        assertEquals(738, contaCor1.getNumero());
    }

    @Test
    public void testGetNumeroDois()
    {
        ContaCorrente contaCor1 = new ContaCorrente();
        contaCor1.setNumero(780);
        assertEquals(780, contaCor1.getNumero());
    }

}
