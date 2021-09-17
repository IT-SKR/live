package com.helloliu.live.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.helloliu")
@SpringBootApplication
@MapperScan("com.helloliu.live.mapper")


public class LiveApplication {

	private static final Logger LOG = LoggerFactory.getLogger(LiveApplication.class);

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LiveApplication.class);
		Environment environment = app.run(args).getEnvironment();
		LOG.info("启动成功");
		LOG.info("地址：\thttp://127.0.0.1:{}",environment.getProperty("server.port"));
//		SpringApplication.run(LiveApplication.class, args);
	}

}
