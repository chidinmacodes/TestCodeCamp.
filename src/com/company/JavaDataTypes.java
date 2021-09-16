package com.company;

public class JavaDataTypes {
    public static void
    main(String[] args)

    {
        //  byte from -128 to 127
        //   short from -32,768 to 32,767
        //  int from -2,147,483,648 to 2,147,483,647
        // long -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (YOU NEED TO CAST IT BY ADDING )
        // float from 6 to 7 decimal digits (YOU NEED TO CAST IT BY ADDING F)
        //double from 15 decimal digits
        //char single letters= 'a' 'b'
        // boolean = true, false

        byte age = -127;
        System.out.println("Byte" + age);

        short money = 32_766;
        System.out.println( "Short data type = " + money);

        int numberOfStudents= 2147483646;
        System.out.println("Int data type = " + numberOfStudents);

        long populationOfVillage = -2147483649l;
        System.out.println( "Long data type = " +populationOfVillage);

        float area = 12345678.90f;
        System.out.println("Float data type = " + area);
        // print (area)it will return as 1.2345679E7 because it can only take 7 decimal places. where the digits are reduced to 7 , the right number will come out.

        float villageSquare =  1234567.8f;
        System.out.println("Representing float data type again  = " + villageSquare);
        //here we will have 1234567.8 making it correct to 7 decimal places.

        Double biggerVillageArea = 12345678910.123;
        System.out.println("Double data type = " +biggerVillageArea);
        // result is 1.2345678910123E10

        char chooseOptions = 'a';
        System.out.println( "Char data type = " +chooseOptions);

        boolean trueOrFalse= true;
        System.out.println("Boolean data type = " +trueOrFalse);

    }
}

