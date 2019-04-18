package cn.lll.feign.web;

import cn.lll.feign.client.HelloClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @Autowired
    private HelloClient hello;

    @GetMapping("hello")
    public String sayHello(){
        String str = "8083端口正在被调用:";
        log.info(str);
        return str+hello.hello();
    }
}
