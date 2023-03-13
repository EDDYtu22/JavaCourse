import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    
    public static void main(String[] args) {
        String newString = strExp("twothreeplusseveneight");
        
        System.out.println(newString); 
        


    }

    public static String strExp(String input){
        String result = input;

       result = result.replaceAll("one", "1");
       result = result.replaceAll("two", "2");
       result = result.replaceAll("three", "3");
       result = result.replaceAll("four", "4");
       result = result.replaceAll("five", "5");
       result = result.replaceAll("six", "6");
       result = result.replaceAll("seven", "7");
       result = result.replaceAll("eight", "8");
       result = result.replaceAll("nine", "9");
       result = result.replaceAll("zero", "0");
       result = result.replaceAll("plus", "+");
       result = result.replaceAll("minus", "-");


            
        
        



        return result;
    }
}
