interface Sum{
    int a = 10;
    int b = 20;
    void getSum();
}

class AnonomyousInnerClass {
    public static void main(String args[]){
        Sum obj = new Sum(){
            public void getSum(){
                System.out.println(a+b);
            }
        };
        obj.getSum();

    }
}

