package com.spring.boot.starter.hello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.boot.starter.hello.service.HelloStarterService;

/**
 * 自动配置类，用于完成Bean创建等工作。
 * @author yanhong_yang
 *
 */
// 标记为配置类
@Configuration
// 启动配置属性
@EnableConfigurationProperties(HelloProperties.class)
// 保证Service接口在
@ConditionalOnClass(HelloStarterService.class)
@ConditionalOnProperty(prefix = "spring.starter.hello",value = "enabled",matchIfMissing = true)
public class HelloStarterServiceAutoConfiguration {
	
	@Autowired
	private HelloProperties helloProperties;

	
	@Bean
	@ConditionalOnMissingBean(HelloStarterService.class)
	public HelloStarterService helloStarterService() {
		return new HelloStarterService(helloProperties);
	}
}
