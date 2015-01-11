
package fortestquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Мармадюк
 */
public class ForTestQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] words = {"аз","глагол", "глагол","буки", "веди",  "добро"};
//Как вы можете обратить внимание, у нас есть массив строк String[] words. 
//В котором у нас лежат 5 строк.
List<String> wordList = Arrays.asList(words);
     Set<String> tSet = new HashSet<String>();
     for(String item: wordList)
         tSet.add(item);
     for(String item: tSet){
         System.out.println(item);
         System.out.println(item.hashCode());   
     }
     
    run2();
     
     
    }
    
   static void run2(){
       Integer[] words = {1,6, 6,2, 3,  8,11};
//Как вы можете обратить внимание, у нас есть массив строк Integer[] words. 
//В котором у нас лежат 5 строк.
List<Integer> wordList = Arrays.asList(words);
     Set<Integer> tSet = new TreeSet<Integer>();
     for(Integer item: wordList){
         System.out.println(item);
         tSet.add(item);
     }    
     for(Integer item: tSet){
         System.out.println(item);
         //System.out.println(item.hashCode());   
     } 
    }
}
