public class TrappingRainWater {
    public static void main(String[] args) {
   int h[]={0,1,0,2,1,0,1,3,2,1,2,1};
   int res=trap(h);
        System.out.println(res); 
}
    public static int trap(int[] height) {
        
        if(height.length==0){
            return 0;
        }
        int s=height.length;
        int c=0;
        int[] lmax=new int[s];
        int[] rmax=new int[s];
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
        return c;
    }
    }    

