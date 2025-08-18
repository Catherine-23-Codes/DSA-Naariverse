public class Largest2 {
    public static int FindLargest(int[]arr){
        int largest=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]arr={1,-6,2,0,-2,-6,-8,1};
        int largest_num=FindLargest(arr);
        System.out.println("The largest number is:"+largest_num);
    }
}
