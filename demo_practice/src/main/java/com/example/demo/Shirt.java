package com.example.demo;

import org.springframework.stereotype.Component;

/* 
 * Danh dau clas bang @Component
 * Class nay se duoc Spring Boot hien la 1 Bean (hoac dependency)
 * va se duoc Spring Boot quan ly 
 */
@Component
public class Shirt implements Outfit
{
    @Override
    public void wear()
    {
        System.out.println("Shirt is worn");
    }
}
