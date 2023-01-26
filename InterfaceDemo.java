

interface Rice{

    void quantity_required(int n);
    void receipe(String receipe);
    void taste(String t);

}
 class InterfaceDemo implements Rice{

    /* An interface is a blue print of the behaviour of a class. It tells what a class must do not HOW to do.
    * Any class must implement all the methods in the class. Interfaces are used in abstraction.*/
    int quantity;
    String receipe;
    String taste;

    InterfaceDemo(int quantity, String receipe, String taste)
    {
        this.quantity = quantity;
        this.receipe = receipe;
        this.taste = taste;
    }


     @Override
     public void quantity_required(int n) {
         System.out.println(quantity);

     }

     @Override
     public void receipe(String receipe) {
         System.out.println(receipe);
     }

     @Override
     public void taste(String t) {
         System.out.println(taste);
     }

     public static void main(String[] args) {
         InterfaceDemo pulihara = new InterfaceDemo(2,"Easy mix when you know", "Awesom!!");

         InterfaceDemo dosaBatter = new InterfaceDemo(1, "For two cups of rice", "Marvellous");

         InterfaceDemo biryani = new InterfaceDemo(5, "For a family: full biryani, go through steps","Authentic");

         System.out.println("Sample Receipes with Rice are: ");

         System.out.println("Pulihara" + pulihara.quantity + "Receipe: " + pulihara.receipe + "Taste: " + pulihara.taste);





     }



 }


