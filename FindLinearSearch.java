public class FindLinearSearch {
    public static int LinearSearch(int[]arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1; //elem doesn't exist
    }
    public static void main(String[] args) {
        int[]arr={2,4,5,7,1,0};
        int target=11;
        int result=LinearSearch(arr,target);
        if(result!=-1){
            System.out.println("Elem is found at index:"+result);
        }else{
            System.out.println("The elem is not found!");
        }
    }
}
