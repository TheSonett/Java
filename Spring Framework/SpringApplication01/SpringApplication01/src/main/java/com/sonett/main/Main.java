package com.sonett.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sonett.config.GameConfig;
import com.sonett.controller.GameRunner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		
		//var obj = new Mario();
		//GameRunner runner = new GameRunner(obj);
		//runner.play();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);
		context.getBean(GameRunner.class).play();
	}

}
