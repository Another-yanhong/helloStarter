package com.spring.boot.starter.hello.service;

import com.spring.boot.starter.hello.config.HelloProperties;

public class HelloStarterService {
	
	private HelloProperties helloProperties;
	
	public HelloStarterService() {}
	
	public HelloStarterService(HelloProperties helloProperties) {
		this.helloProperties=helloProperties;
	}
	
	public void sayHello() {
		System.out.println("hi,我的名字是："+helloProperties.getName()+",今年"+helloProperties.getAge()
		+"岁，性别是："+helloProperties.getSex());
	}

}
