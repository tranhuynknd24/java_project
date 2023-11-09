package com.example.jpaquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.UserRepository.UserRepository;
import com.example.model.User;

import lombok.RequiredArgsConstructor;

@SpringBootApplication(scanBasePackages = "com.example.UserRepository")
@RequiredArgsConstructor
public class JpaqueryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaqueryApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		System.out.println("Tim user voi Agi trong khoang (25 - 30)");
		System.out.println("findAllByAgiBetween: ");
		userRepository.findAllByAgiBetween(25, 30)
					  .forEach(System.out::println);
		
		System.out.println("===========================================");
        System.out.println("Tìm user với Agi trong lớn hơn 97");
        System.out.println("findAllByAgiGreaterThan: ");
        userRepository.findAllByAgiGreaterThan(97)
                      .forEach(System.out::println);

        // Tìm kiếm tất cả theo Atk = 74
        System.out.println("===========================================");
        System.out.println("Tìm user với Atk = 74");
        System.out.println("findAllByAtk: ");
        userRepository.findAllByAtk(74)
                      .forEach(System.out::println);

        System.out.println("===========================================");
        System.out.println("Tìm User với def = 49");
        System.out.println("SELECT u FROM User u WHERE u.def = :def");
        User user = userRepository.findUserByDefQuery(49);
        System.out.println("User: " + user);
	}

}
