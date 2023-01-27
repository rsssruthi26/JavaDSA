public class IsPowerOfTwo {

    static void checkPower(int n)
    {
        int res = 0;
        while(n > 0)
        {
            n = n & (n-1);
            res++;
        }
        if( res == 1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static void main(String args[])
    {
        int n = 65;
        checkPower(n);
    }
}
