interface Matter{
    void getProduct(int a, int b); //Abstract function

    default void print(){
        System.out.println("Hello");

    }
}
class LambdaExpression{
    public static void main(String args[]){
        Matter obj = (int a, int b) -> System.out.println(a*b); //Lambda Expression
        obj.getProduct(10,20);
    }
}