package cn.opm.vue_server_api;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.opm.vue_server_api.mapper")
public class VueServerApiApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(VueServerApiApplication.class);
        SpringApplication.run(VueServerApiApplication.class, args);
    }

}
