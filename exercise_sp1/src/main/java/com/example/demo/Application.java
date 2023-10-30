package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application 
{
    public static void main(String[] args)
    {
        /* ApplicationContext chinh la container, chua toan bo cac Bean */
        ApplicationContext context = SpringApplication.run(Application.class, args);
        /* Khi chay xong, luc nay context se chua cac Bean co danh dau @Component */

        /* Lay Bean bang cach */
        Outfit outfit = context.getBean(Outfit.class);
        /* Hoac su duSng @Autowired de inject bean tuong ung */
        /* Outfit outfit; */

        /* In ra */
        System.out.println("Instance: " + outfit);
        outfit.wear();
    }
}
