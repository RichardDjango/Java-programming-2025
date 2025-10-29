public class LargestNo {
    public static void main(String[] args){
        int[] nos = {20,340,19,97,28,55};
        int LargestNum = 1;

        for(int i =0; i<nos.length;i++){
            if(nos[i] > LargestNum){
                LargestNum = nos[i];
            }
        }

        System.out.printf("The largest number is: " + LargestNum  );
    }
}
