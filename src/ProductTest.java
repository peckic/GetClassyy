public class ProductTest {

    public static void main(String[] args)
    {
        Product cheese = new Product("cheddar","creamy orange","000001",5.99);

        System.out.println(cheese);
        System.out.println(cheese.getName());
        System.out.println(cheese.getCost());
        cheese.setCost(4.99);
        System.out.println(cheese.getCost());
        System.out.println(cheese.toCSV());

    }

}
