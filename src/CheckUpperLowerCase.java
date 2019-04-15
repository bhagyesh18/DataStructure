import java.text.DecimalFormat;
 
public class CheckUpperLowerCase
{   
    static void characterPercentage(String inputString)
    {
        //Getting total no of characters in the given string
         
        int totalChars = inputString.length();
         
        //Initializing upperCaseLetters, lowerCaseLetters, digits and others with 0
         
        int upperCaseLetters = 0;
         
        int lowerCaseLetters = 0;
         
        int digits = 0;
         
        int others = 0;
         
        //Iterating through each character of inputString
         
        for (int i = 0; i < inputString.length(); i++) 
        {
            char ch = inputString.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upperCaseLetters++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetters++;
            }
            else if (Character.isDigit(ch))
            {
                digits++;
            }
            else
            {
                others++;
            }
        }
         
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
        double digitsPercentage = (digits * 100.0) / totalChars;
        double otherCharPercentage = (others * 100.0) / totalChars;
        DecimalFormat formatter = new DecimalFormat("##.##");
        
        System.out.println("In '"+inputString+"' : ");
         
        System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"% ");
         
        System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");
         
        System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
         
        System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
         
        System.out.println("-----------------------------");
    }
     
    public static void main(String[] args) 
    {
        characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
         
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
         
        characterPercentage("AUS : 123/3, 21.2 Overs");
    }
}