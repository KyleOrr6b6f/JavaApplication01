package com;

import static org.junit.Assert.*;

public class UserTest {

    User temp = new User();

    @org.junit.Test
    public void getName() {
        temp.setName("Steve");
        assertEquals("Steve", temp.getName());

    }

    @org.junit.Test
    public void setName() {
        temp.setName("Steve");
        assertEquals("Steve", temp.getName());
    }
}