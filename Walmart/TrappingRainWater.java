/*we have given int array as size of bars and 
we have to find that how much water it is capable to trap after raining
*/

public class TrappingRainWater {
    public static void main(String[] args) {
     //height of each bars in form of int array
   int h[]={0,1,0,2,1,0,1,3,2,1,2,1};
   int res=trap(h);
        System.out.println(res); 
}
    //this method will give how much unit of water can be trapped
    public static int trap(int[] height) {
        
        if(height.length==0){
            return 0;    //if length of array is zero then simply we'll return 0
        }
        int s=height.length;
        int c=0;
        int[] lmax=new int[s];  //making array in increasing order from left to right(max element till now)
        int[] rmax=new int[s];  //making array in increasing order from right to left
        
        lmax[0]=height[0];
        int l=height[0];
        rmax[s-1]=height[s-1];
        int r=height[s-1];
        for(int i=0;i<s-1;i++){
            if(l<height[i+1]){
                l=height[i+1];
                lmax[i+1]=l;
            }else{
                lmax[i+1]=l;
            }
        }
        
        for(int j=s-1;j>0;j--){
            if(r<height[j-1]){
                r=height[j-1];
                rmax[j-1]=r;
            }else{
                rmax[j-1]=r;
            }
        }
        
        //comparing lmax and rmax
        for(int i=0;i<s;i++){
            if(lmax[i]<=rmax[i]){
               int f= height[i]-lmax[i];
                if(f<0){
                    f=-(f);
                }
                c=c+f;
            }else
            if(lmax[i]>=rmax[i]){
                int f=height[i]-rmax[i];
                if(f<0){
                    f=-(f);
                }
                c=c+f;
            }
        }
        return c;   //returning result(unit of water that can be trapped)
        }
    }    

