package api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @description: 11
 * @author: zhanglu
 * @create: 2020-05-14 08:49
 */
@FeignClient("test")
public interface UserRemoteClient {
    @GetMapping("/user/name")
    String getName();

    //多参数方式 具体
    @GetMapping("/user/info")
    String getUserInfo(@RequestParam("name")String name,@RequestParam("age")int age);

    //多参数方式 map
    @GetMapping("/user/detail")
    String getUserDetail(@RequestParam Map<String,Object> map);

    @PostMapping("/user/add")
    String addUser(@RequestBody User user);
}
