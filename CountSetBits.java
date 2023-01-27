public class CountSetBits {

    static int countBits(int n)
    {
        int sum = 0 ;
        while(n>0)
        {
            sum = sum + (n&1);
            n = n >>1;
        }
        return sum;
    }

    public static void main(String args[])
    {
        int n = 13;
        System.out.println("Hello World");

        System.out.println(countBits(n));
    }
}
