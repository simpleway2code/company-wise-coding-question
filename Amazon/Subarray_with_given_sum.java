import java.util.*;
public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        ArrayList<Integer> res = subarraySum(arr,arr.length,12);
        for(int i=0;i<res.size();i++)
        {
            
            System.out.print(res.get(i)+" ");
        }
    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i=0,j=0;
        int sum = 0;
        int l=0,r=0;
        ArrayList<Integer> arl = new ArrayList<>();
        
        while(j<n)
        {
            sum+=arr[j];
            
            while(sum>s){
                sum-=arr[i];
                i++;
            } 
            
            if(sum==s){
               l=i+1;
               r=j+1;
               break;
            }
            j++;
        }
        if(l==0 && r==0)
            arl.add(-1);
        else {
            arl.add(l);
            arl.add(r);
        }
        
        return  arl;
    } 
}
