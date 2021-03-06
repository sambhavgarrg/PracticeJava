package bin.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below.
    static void countingValleys(int n, String s) {
      int flag, c = 0, cacheStart = 0, v = 0;
      for(int i=0; i<n; i++){
        if(s.charAt(i) == 'D'){
          c--;
        }
        else if(s.charAt(i) == 'U'){
          c++;
        }
        if(c == 0){
          StringBuilder str = new StringBuilder(s.substring(cacheStart,i+1));
          flag = (str.toString().startsWith("D") && str.toString().endsWith("U")) ? 1 : 0;
          cacheStart = i+1;
          if(flag == 1){
             v++;
           }
        }
      }
      System.out.println(v);
    }

    // private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = scanner.nextInt();
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      String s = scanner.nextLine();
      // int n = 12;
      // String s = "DDUUDDUDUUUD";

      int result = countingValleys(n, s);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedWriter.close();

      scanner.close();
  }
}
