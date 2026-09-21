public class ArrayMin {
    public static void main(String[] args){
        int[] arr = {10, 23 , 1, -1 ,2};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        } 
        System.out.println("Minimum number: "+min );
    }
}
