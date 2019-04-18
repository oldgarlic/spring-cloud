package cn.lll.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("hello")
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(){
        String str = "端口8082正在被调用：";
        return str+restTemplate.getForObject("http://SERVER-PROVIDER/hello",String.class);
    }

    public String helloError(){
        return "抱歉，服务出错!";
    }
}
