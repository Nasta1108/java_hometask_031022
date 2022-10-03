public class Main {
    public static void main(String[] args) {
        int[] number1 = new int[]{22,102,33,69,85};
        int[] number2 = new int[]{33,69,102,22,58};

        for (int i = 0; i < number1.length; i++)
        {
            int a = number1[i];
            for (int j = 0; j < number2.length; j++)
            {
                if (a == number2[j])
                {
                    System.out.println("Number that repeat: " + a);
                    break;
                }
            }
        }
    }
}
