package com.mkyong.hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.web.bind.annotation.RequestParam;

class junitTest {

	private static final String template = "Hello, %s!";
 
    @Test
    public void testGet()
    {
        Greetings greet = new Greetings(1,String.format(template, "name"));
        assertEquals("Hello, name!",greet.getContent());
    }
    
}

