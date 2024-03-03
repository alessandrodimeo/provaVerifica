package provaVerifica;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test1Calc {

	@Test
	public void test() {
		double result = Calcolatrice.somma(2, 1);
		assertEquals(2f, result, 3);
	}

}
