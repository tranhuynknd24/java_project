package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dress implements Outfit
{
    @Override
    public void wear()
    {
        System.out.println("Dress is worn");
    }
}
