package com.example.JpaMySQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaMySqlApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(JpaMySqlApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/* Lay ra toan bo user trong DB */
		userRepository.findAll()
					  .forEach(System.out::println);
		
		/* Luu user xuong database */
		User user = userRepository.save(new User());
		/* Khi luu xong, no tra ve User da luu kem theo Id */
		System.out.println("User vua lua co ID: " + user.getId());
		Long userId = user.getId();
		/* Cap nhat user */
		user.setAgi(100);
		/* Update user
		 * Luc nay doi tuong user da co Id
		 * Nen no se update vao doi tuong co Id nay
		 * chu ko insert 1 ban ghi moi
		 */
		userRepository.save(user);
		
		/* Query lay ra user vua xong de kiem tra xem */
		User user2 = userRepository.findById(userId).get();
		System.out.println("User: " + user);
		System.out.println("User2: " + user2);
		
		/* Xoa user khoi database */
		userRepository.delete(user);
		
		/* In ra kiem ta xem user Id con ton tai trong DB hay khong */
		User user3 = userRepository.findById(userId).orElse(null);
		System.out.println("User3: " + user3);
	}

}
