package com.company;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @org.junit.jupiter.api.Test
    void reg()
    {
        Register register = new Register();
        register.reg("Vitalya", "123456");
        assertEquals(register.registrated.get(0).getName(), "Vitalya");
        assertEquals(register.registrated.get(0).getPassword(), "123456");
        System.out.println("Тест на регистрацию успешен");
    }

    @org.junit.jupiter.api.Test
    void testReg()
    {
        Register register = new Register();
        register.reg("Vitalya");
        assertEquals(register.registrated.get(0).getName(), "Vitalya");
        String pass = register.registrated.get(0).getPassword();
        assertEquals(register.registrated.get(0).getPassword(), pass);
        System.out.println("Тест на регистрацию с одним логином успешен");

    }

    @org.junit.jupiter.api.Test
    void del()
    {
        Register register = new Register();
        register.reg("Vitalya", "123456");
        register.reg("Polina", "654321");
        register.del("Vitalya", "123456");
        assertEquals(register.registrated.get(0).getName(), "Polina");
        System.out.println("Успешный тест на удаление пользователя");
    }
}