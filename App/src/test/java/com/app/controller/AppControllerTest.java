package com.app.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppController.class })
@WebAppConfiguration
public class AppControllerTest {

	private MockMvc mockMvc;

	@Test
	public void testXMlProcessingIntoDB() throws Exception {
		mockMvc.perform(post("/{zipFilePath}/parseXMl", "C:/Users/Hardik Shah/Downloads/990AllXML.zip"))
				.andExpect(status().isOk());
	}
}