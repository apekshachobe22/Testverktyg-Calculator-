package org.example;


import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    @Test
    @QaseTitle("add")
    public void add () {
        // Given
        Calculator calculator= new Calculator();
        int number1 = 5;
        int number2 = 10;
       
        // When
        int result = calculator.add(number1,number2);

        // Then
        assertEquals(15, result);

    }
     @Test
     @QaseTitle("sub")
     public void sub(){
        //Given
         Calculator calculator = new Calculator();
         int number1 = 20;
         int number2 = 10;

         //When
         int result = calculator.sub(number1,number2);

         // Then
         assertEquals(10, result);
     }
     @Test
     @QaseTitle("mul")
     public void mul(){
        //Given
         Calculator calculator = new Calculator();
         int term1= 5;
         int term2= 5;

         // When
         int sum= calculator.mul(term1,term2);

         //Then
         assertEquals(25,sum);
     }
     @Test
     @QaseTitle("div")
    public void div(){
        //Given
         Calculator calculator= new Calculator();
         int term1= 10;
         int term2= 2;

         //When
         int sum=calculator.div(term1,term2);

         //Then
         assertEquals(5,sum);
     }

     @Test
     @QaseTitle("divbyZero")
    public void divbyZero(){
        // Given
         int term1 = 10;
         int term2=  0;

         // When
         assertThrows(ArithmeticException.class,() -> div(term1,term2));
     }

         // Then
      public int div(int term1,int term2){
        if (term2==0){
            throw new ArithmeticException("cannot divide by zero");
        }
        return term1/term2;
      }

}


