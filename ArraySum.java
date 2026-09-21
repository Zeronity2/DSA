public class ArraySum {
    public static void main(String[] args){
        int[] arr={100,50,10,-90};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
    System.out.println("Sum of all the elements: "+sum);
    }
}
