package top.misec.webhooks;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author moshi
 */
@SpringBootApplication
@MapperScan("top.misec.webhooks.mapper")
public class FastWebhookApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastWebhookApplication.class, args);
    }

}
