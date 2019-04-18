package cn.lll.feign.client;

import org.springframework.stereotype.Component;

@Component
public class HelloError implements HelloClient{

    public String hello(){
        return "抱歉，服务故障！";
    }
}
