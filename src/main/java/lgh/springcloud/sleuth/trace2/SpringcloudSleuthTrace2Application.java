package lgh.springcloud.sleuth.trace2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudSleuthTrace2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudSleuthTrace2Application.class, args);
	}
}
