
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 *
 * @author snow28
 */
public class lambda {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        int max =0;
        int min =1;
        int letters=0;
        
        length wordLength = s->s.length();
        
        File file = new File("text.txt");
        Scanner input = new Scanner(file); 

        while (input.hasNext()) {
          String word  = input.next();
          //System.out.println(word);
          letters += wordLength.length(word);
          if(wordLength.length(word) > max){
              max = wordLength.length(word);
          }
          if(wordLength.length(word) < min ){
              //System.out.println(word);
              min = wordLength.length(word);
          }
          count = count + 1;
        }
        double avarageLength = letters/count;
        System.out.println("Word count: " + count + "\n Max : " + max + "\n Min : " + min + "\n Avarage length : " + avarageLength);

    }
    
}

interface length{
    int length(String s);
}
