public class SecondLargest2 {
    public static int LinearSearch(int[]arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,6,2,7,3,8,4};
        int target=7;
        int index=LinearSearch(arr,target);
        if(index!=-1){
            System.out.println("The number is found at index:"+index);
        }else{
            System.out.println("The number is not found at all!");
        }
    }
}
