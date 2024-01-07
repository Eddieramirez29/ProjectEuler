public class App {
    public static void main(String[] args) 
    {
        int limite = 999;
        int maxPalindrome = 0;
        int numA = 0;
        int numB = 0;

        for (int i = 100; i <= limite; i++) 
        {
            for (int j = i; j <= limite; j++)
            {
                int product = i * j;
                if (isPalindrome(product) && product > maxPalindrome)
                 {
                    maxPalindrome = product;
                    numA = i;
                    numB = j;
                }
            }
        }

        System.out.println("Número A: " + numA);
        System.out.println("Número B: " + numB);
        System.out.println("Producto: " + maxPalindrome);
    }

    private static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        String reversed = new StringBuilder(strNumber).reverse().toString();
        return strNumber.equals(reversed);
    }
}
