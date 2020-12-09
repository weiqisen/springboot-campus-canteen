package cn.sise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author weiqisen
 * @date 9/12/2020 9:51 上午
 */

@SpringBootApplication
@MapperScan(basePackages = "cn.sise.dao")

//@EnableSwagger2 //启用swagger2
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
