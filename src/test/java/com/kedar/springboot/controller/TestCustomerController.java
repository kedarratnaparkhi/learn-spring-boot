package com.kedar.springboot.controller;//package com.kedar.springboot.controller;
//
//import com.kedar.springboot.domain.Customers;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class TestCustomerController {
//
//    @Autowired MockMvc mockMvc;
//
//    private String objData = "{\n" + "    \"firstName\": \"Kedar 5\",\n" + "    \"lastName\": \"Ratnaparkhi 4\",\n" + "    \"orders\": [\n"
//            + "        {\n" + "            \"invoiceAmount\": 4\n" + "        }\n" + "    ]\n" + "}";
//
//    @Test
//    public void addCustomerTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.post("http://localhost:8080/addCustomer").content(objData)).andExpect(status().isOk());
//
//    }
//
//    @Test
//    public void getCustomerTest() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/customer/Kedar%204")).andExpect(status().isOk());
//    }
//}
