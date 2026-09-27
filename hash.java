class laptop
{
    String model;
    int price;
}



public class hash
{
    public static void main(String a[])
    {
      laptop obj = new laptop();
      obj.model = "asus";
      obj.price = 125;
      System.out.println(obj.model + " : " + obj.price);

    }
}