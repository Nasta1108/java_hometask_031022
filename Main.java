public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,16,19,315};

        int max = array[0];

        for (int i : array){
            if (i >max && i % 2 !=0){
                max = i;
            }
        }

        System.out.println("Max number is " + max);
    }
}
