package id.tokoonderdil.study.springbootdruid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"id.tokoonderdil.study.springbootdruid.dao"})
public class SpringbootdruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdruidApplication.class, args);
    }
}
