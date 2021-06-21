package com.mycompany.implementacaojunitmdc;

import java.util.Objects;

/**
 *
 * @author camila
 */
public class MathUtil {
    public static int mdc(int a, int b){
        
        //PROPRIEDADE 7
        a = Math.abs(a);
        b = Math.abs(b);
        
        //PROPRIEDADE 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //PROPRIEDADE 1
        if(b > 0 && a % b == 0){
            return b;
        }
        
        //PROPRIEDADE 3
        if(b == 0){
            return Math.abs(a);
        }
        
        //PROPRIEDADE 5
        /*if(a % b != 0){
            return 1;
        }*/
        
        
        
        return mdc(a - b, b);
    }
    
    public static int mdc(int ...valores) {
        Objects.requireNonNull(valores, "O parâmentro valores não pode ser nulo!");
        
        if(valores.length == 0){
            throw new IllegalArgumentException("E preciso indicar os valores!");
        }
        
        int a = valores[0];
        for(int b : valores){
            a = mdc(a, b);
        }
        return a;
    }
}
