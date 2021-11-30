import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg{
     public static void main(String[] args) {
         String target="879123457ddabde gla76283748947";
         Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
         //Pattern p1=Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
         int ctr=0;
         Matcher m=p.matcher(target);
         while(m.find())
         {
             ctr++;
             System.out.println(m.start()+" "+m.end()+" "+m.group());//it will print more info about the matching string
         }
         System.out.println();
         String s1="9876543210";
         System.out.println(s1.matches("(0|91)?[7-9][0-9]{9}"));
     }
 }