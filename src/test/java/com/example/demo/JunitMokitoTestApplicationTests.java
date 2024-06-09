package com.example.demo;



import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.model.Employe;



@SpringBootTest
class JunitMokitoTestApplicationTests {

	private MockMvc mockMvc;
	
	private WebApplicationContext context;
	
	@Before(value = "")
	private void setUp() {
		mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	
	@Test
	public void addEmployeeTest() {
		Employe employe = new Employe();
	 employe.set
	}
	
	
}
