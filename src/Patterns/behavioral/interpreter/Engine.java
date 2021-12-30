package Patterns.behavioral.interpreter;

public class Engine {
    public int add(String input){
        String strArr[] =interpret(input);
        int num1=Integer.parseInt(strArr[0]);
        int num2=Integer.parseInt(strArr[1]);
        return num1+num2;
    }
    public int multiply(String input){
        String strArr[] =interpret(input);
        int num1=Integer.parseInt(strArr[0]);
        int num2=Integer.parseInt(strArr[1]);
        return num1*num2;
    }
    public int substract(String input){
        String strArr[] =interpret(input);
        int num1=Integer.parseInt(strArr[0]);
        int num2=Integer.parseInt(strArr[1]);
        return num1-num2;
    }

    private String [] interpret(String input){
        String string = input.replaceAll("[^0-9]", " ").replaceAll("( )+", " ").trim();
        String[]strArr=string.split(" ");
        return strArr;
    }
}
