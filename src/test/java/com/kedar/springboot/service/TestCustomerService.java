package com.kedar.springboot.service;//package com.kedar.springboot.service;
//
//import com.kedar.springboot.SpringBootLearnApplication;
//import com.kedar.springboot.domain.Customers;
//import com.kedar.springboot.repository.CustomerRepository;
//import com.kedar.springboot.service.CustomerService;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.List;
//
//import static com.kedar.springboot.ass.CustomerAssert.assertThat;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@ExtendWith(SpringExtension.class)
//class TestCustomerService {
//
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    //private final CustomerRepository customerRepository = Mockito.mock(CustomerRepository.class);
//
//    @Autowired
//    private CustomerService customerService;
//
////    private List<Customers> getMockObj(){
////        List<Customers> customersList = new ArrayList<>();
////        customersList.add(new Customers());
////        customersList.add(new Customers());
////
////        return customersList;
////    }
//
//
//    @Test
//    public void getCustomerTest(){
//        //when(customerRepository.findByFirstName(any(String.class))).thenReturn(this.getMockObj());
//        //System.out.println(customerService.getCustomer("Kedar 4"));
//        //Assertions.assertEquals(2, customerService.getCustomer("Kedar 4").size());
//    }
//
//
//    @Test
//    public void addUniqueCustomerTest(){
//        Customers cust = new Customers();
//        cust.setFirstName("Hell");
//        cust.setLastName("JSON");
//
//        assertThat(cust, customerRepository).isUniqueName();
//    }
//
//
//    @Test
//    public void getCustomerTestV2(){
//        List<Customers> custs = customerRepository.findByFirstNameAndLastName("Hell","JSON");
//        System.out.println(custs.get(0).getFirstName());
//    }
//}
