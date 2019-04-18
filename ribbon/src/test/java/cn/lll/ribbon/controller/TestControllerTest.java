package cn.lll.ribbon.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
    @Autowired
    private RestTemplate restTemplate;
    @Test
    public void test(){
        System.out.println(restTemplate.getForObject("http://SERVER-PROVIDER/hello",String.class));
    }
    
}