public class CheckKthBitIsSet {

    static void checkIsSet(int n , int k)
    {
        if((n>>(k-1)&1)!=0)
        {
            System.out.println("Yes");

        }
        else
            System.out.println("No");


    }

    public static void main(String args[])
    {
        int n = 8;
        int k = 3;
        checkIsSet(n,k);
    }
}
