enum laptop{
    asus(2000),vivobook(2100),mackbook(2300),samgang(2500),lenova(2700),hp(2900),dev(3000),microsoft(3100);
   private int price;

    private laptop(int price){
      this.price=price;
   }
   
}

public class enumclatss {
    public static void main(String[] args) {
        laptop s = laptop.asus;
        System.out.println(s);
    }
    
}
