package cn.xzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname App
 * @Description
 * @Date 2020-07-02 15:07
 * @Created by xzh
 */

@SpringBootApplication
@MapperScan("cn.xzh.dao")
public class App {

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }

}
