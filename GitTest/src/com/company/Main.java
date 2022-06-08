package com.company;

public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.reg("Vitalya", "123456");
        register.reg("Ksenia");
        register.reg("Pavel");
        register.del("Vitalya","123456");
        System.out.println(register.registrated.get(0).getName());
        System.out.println("Первый пользователь Vitalya успешно удален");
    }
}
