package practiceDemo;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int sum=0;
    int[] ar=new int[arr.size()];
    for (int i=0;i<arr.size();i++){
        int val=arr.get(i);
        for(int j=0;i<arr.size();j++){
            sum=sum+arr.get(j);
            
        }
        ar[i]=sum;  
    }
    for(int i=0;i<ar.length;i++){
        System.out.println(ar[i]);
    }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}