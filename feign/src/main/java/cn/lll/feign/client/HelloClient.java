package cn.lll.feign.client;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "SERVER-PROVIDER",fallback = HelloError.class)
public interface HelloClient {

    @GetMapping("hello")
    String hello();
}
