package com.company;

import java.security.SecureRandom;
import java.util.ArrayList;
public class Register
{
    ArrayList<User> registrated =new ArrayList<>();

    public void reg(String name,String pass)
    {
        User user = new User();
        user.setName(name);
        user.setPassword(pass);
        registrated.add(user);
    }
    public void reg(String name)
    {
        User userCut = new User();
        String pass = generatePassword(6, ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC);// генерируем пароль
        userCut.setPassword(pass);
        userCut.setName(name);
        registrated.add(userCut);
    }
    public void del(String name,String pass) {
        for (int i = 0; i < registrated.size(); i++) {
            if (registrated.get(i).getName().equals(name) && registrated.get(i).getPassword().equals(pass)) {
                registrated.remove(i);
            }
        }
    }
    // Далее Генератор Паролей с интернета
    private static SecureRandom random = new SecureRandom();

    /** different dictionaries used */
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    /**
     * Method will generate random string based on the parameters
     *
     * @param len
     *            the length of the random string
     * @param dic
     *            the dictionary used to generate the password
     * @return the random password
     */
    public static String generatePassword(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }
}

