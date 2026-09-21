public class ArrayMax {
    public static void main(String[] args){
        int[] arr = {10,15,80,25,30};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}
