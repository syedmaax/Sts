import java.util.* ;
import java.io.*;
public class StobogrammaticNumber {
    public static boolean isStrobogrammatic(String n) {
        StringBuilder s=new StringBuilder();

        for (int i =n.length()-1;i >=0;i--){
            char ch =n.charAt(i);
            if (ch=='6') {
                s.append('9');
            } else if(ch=='1') {
                s.append('1');
            } else if(ch=='8') {
                s.append('8');
            } else if(ch=='0') {
                s.append('0');
            } else if(ch=='9') {
                s.append('6');
            } else {
                return false;
            }
        }

        return s.toString().equals(n);
    }
}
