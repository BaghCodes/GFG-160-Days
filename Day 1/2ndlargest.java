//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int s1,s2;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        int p1=0,p2=n-1;
        while(p1<=p2){
            int val1=arr[p1];
            int val2=arr[p2];
            if(val1>p2){
                second_max = max;
                max = val1;
            }
            else if(val1> second_max && val1 != max) {
                second_max=val1;
            }
            
            if(p1!=p2){
                if(val1>max){
                    second_max = max;
                    max = val2;
                }
                else if(val2>second_max && val2!=max) {
                    second_max=val2;
                }
            }
            p1++;
            p2--;
        }
        return second_max;
    }
}
