package org.losremedios.daw1.prog;

public class Matematicas {
    public static Integer suma (Integer a, Integer b){
        return a+b;
    }

    public static Integer suma (Integer a, Integer b, Integer c){
        return suma(a,b)+c;
    }

    public static Double suma (Double a, Double b){
        return a+b;
    }

    public static Integer resta (Integer a, Integer b){
        return a-b;
    }

    public static Integer resta (Integer a, Integer b, Integer c){
        return a-b-c;
    }

    public static Double resta (Double a, Double b){
        return a-b;
    }

    public static Integer division (Integer a, Integer b){
        return a/b;
    }

    public static Integer multiplicacion (Integer a, Integer b){
        return a*b;
    }

    public static Integer factorial (Integer n){
        int factorial = 1;
        int i = 1;
        while (i <= n ){
            factorial = factorial + 1;
        }
        return factorial;
    }

    public static Integer mayor(Integer a, Integer b){
        Integer result = a;
        if (a > b)
            result = a;
        else
            result = b;
        return result;
    }

    public static Integer mayor(Integer a, Integer b, Integer c){
        Integer result = a;
        if(a > b && a > c)
            result = a;
        else if(b > a && b > c)
            result = b;
        else
            result = c;
        return result;
    }
}