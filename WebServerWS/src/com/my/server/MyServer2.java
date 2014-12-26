package com.my.server;

import javax.jws.WebService;

@WebService
public class MyServer2 {
	
	public String sayHi(String x, int y){
		System.out.println("In server ....");
		return x+y;
	}

}
