package com.myshop.order.ui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {

	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	/**
	 * full 테스트 를 위하여 임시 생성 
	 * 
	 */
	@GetMapping("/index")
	public String index(){
		log.info("test index page....");
		return "index";
	}
	
}
