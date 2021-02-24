package com.spring.boot.starter.hello.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * XxxProperties属性配置类，完成属性配置相关的操作，比如设置属性前缀，用于在application.properties中配置。
 * @author yanhong_yang
 *
 */
@ConfigurationProperties(prefix = "spring.starter.hello")
public class HelloProperties {
	
	private String name;
	
	private int age;
	
	private String sex="M";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
