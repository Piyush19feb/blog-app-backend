package com.codewithdurgesh.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithdurgesh.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Autowired
	private UserRepo userRepo;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void repoTest() {
		String className = userRepo.getClass().getName();
		String packageName = userRepo.getClass().getPackageName();
		
		System.out.println("Classname: "+className);
		System.out.println("PackageName: "+packageName);
	}

}
