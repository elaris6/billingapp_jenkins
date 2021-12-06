package com.paymentchain.billing;

import or.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {

	String mensaje = "Mensaje añadido test Jenkins";
	Assert.assertNotNull(mensaje);
	@Test
	public void contextLoads() {
	}

}
