package Substring;

import java.util.*;
import java.text.*;
import java.math.*;

/* Simple regex match
 *
 * We have a regex dialect which has the following rules:
 *     All letters must match the exact same letter
 *     The character * can match any number of letters, including 0 letters
 *     The character * will show up at most once in the regex
 * 
 * Examples:
 *     Regex Ora*ge matches the word Orange
 *     Regex * matches all words
 *
 * Create a function which determines if a regex matches a word
 */
 
public class RegexProblem {
    public static void main(String args[]) throws Exception {
        System.out.println(checkMatch("bhagyesh*patel", "bhagyeshspatel")); // --> true Ora[n]ge    ora[]ge    
    }

    static Boolean checkMatch(String regex, String word) {
        
        boolean res=false;
        if(regex.indexOf("*")<0){
            if(regex.equals(word)){
                return true;
            }else{
                return false;
            }
        }else{
          if(regex.length()==1 && regex.charAt(0)=='*'){
              return true;
          }
          if(word.length()==0){
              return false;
          }
         
          int posWildCard=regex.indexOf("*");
          if(posWildCard==regex.length()-1){
            if(regex.substring(0,regex.length()-1).equals(word)){
                return true;
            }else{
                return false;
            }
          }
          
          String beforeRegex=regex.substring(0,posWildCard);
          String afterRegex=regex.substring(posWildCard+1,regex.length());
          String beforeRegexWord=word.substring(0,posWildCard);
          String afterRegexWord=word.substring(word.length()-afterRegex.length(),word.length());
          
        
          if(beforeRegexWord.equals(beforeRegex) && afterRegexWord.equals(afterRegex)){
              return true;
          }
        }
        return res;
    }
}

