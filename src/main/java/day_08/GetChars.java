package day_08;

public class GetChars {
    public static void main(String[] args) {
        String sourceString = "Hello,World!";
        char[] destinationArray = new char[5];
        
        sourceString.getChars(6, 11, destinationArray, 0);   
        System.out.println(new String(destinationArray));
    }
}