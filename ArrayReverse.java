public class ArrayReverse {
    public static void main(String[] args){
        int[] arr = {10,9,8,7,6};
        int[] rev= new int[arr.length];

        for(int i=0; i<arr.length; i++){
            rev[i] = arr[arr.length-1-i];
        }

        for(int i=0; i<rev.length;i++){
            System.out.println(rev[i]+" ");
        }
    }
}
