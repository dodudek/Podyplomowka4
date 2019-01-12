public class ProductTester {
    public static void main(String[] args) {
        Product [] product = new Product [5];

        product[0] = new Product("Masło", 4.23);
        product[1] = new Product("Chleb", 2.55);
        product[2] = new Product("Masło", 4.23);
        product[3] = new Product("Chleb", 2.80);
        product[4] = new Product("Mleko", 3.30);

        if (product[0].equals(product[2])){
            System.out.println("To ten sam prosukt");
        }else{
            System.out.println("TO dwa różne produkty");
        }

    }
}
