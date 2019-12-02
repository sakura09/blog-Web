package com.yyx.spring.boot.test.initializr.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
/**
 * 因为是MVC框架，所以使用MockMvc
 */
public class HelloControllerTests {

	private MockMvc mockMvc;
	@Autowired		//自动装配MVC

	@Test
	void testHello() {

		//mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON ))
				//.addExpect(content().string(equalTo("HelloWorld")));
		try {
			mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.content().string("Hello World!"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
