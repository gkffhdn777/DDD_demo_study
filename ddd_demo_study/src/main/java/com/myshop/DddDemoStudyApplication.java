package com.myshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @SpringBootApplication 이 선언된 최상위 패키지 부터 scan 
 * @author kimminsuk
 */
@SpringBootApplication
public class DddDemoStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddDemoStudyApplication.class, args);
	}
}
