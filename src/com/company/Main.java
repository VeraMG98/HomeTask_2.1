package com.company;

public class Main {

    public static void main(String[] args) {
        //methodWalk(10, 15);
        //methodWalk(41, -15);
        //methodWalk(5, 26);
        //methodWalk(9, -30);
        //methodWalk(36, 36);
        methodWalk(generateRandomAge(), generateRandomTemp());
    }

    public static int generateRandomAge() {
        int randAge = (int) (1 + (Math.random() * 90));
        System.out.println("Возраст " + randAge + " ");
        return randAge;
    }

    public static int generateRandomTemp() {
        int randTemp = (int) (-40 + (Math.random() * 50));
        System.out.println("Температура " + randTemp + " ");
        return randTemp;
    }

    public static String methodWalk(int age, int temp){
        String string1 = "Можно идти гулять";
        String string2 = "Оставайтесь дома";
        String stringReturn = "";
        if ((age <= 45 && age >= 20)
                && (temp <= 30 && temp >= -20))
            stringReturn = string1;
        else if ((age < 20) && (temp <= 28 && temp >= 0))
            stringReturn = string1;
        else if ((age > 45) && (temp <= 25 && temp >= -10))
            stringReturn = string1;
        else
            stringReturn = string2;
        System.out.println(stringReturn);
        return stringReturn;
    }
}