package com.kedar.springboot.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestDataAccessController {

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void runTest() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/hello-world").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(content().string());
        //ResponseEntity<Map> entity = this.testRestTemplate.getForEntity("http://localhost:8080/hello-world", Map.class);
        //then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);

    }
}
