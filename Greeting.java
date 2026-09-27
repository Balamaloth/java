class college{
    String name;
    int marketration;
    int food;

}


public class Greeting {
    
    public static void main(String[] args) {
        college q1 = new college();
        q1.name= "krishna";
        q1.marketration= 100;
        q1.food= 50;

        college q2 = new college();
        q2.name= "sri";
        q2.marketration= 200;
        q2.food= 100;

        college ecc[] = new college[2];
        ecc[0] = q1;
        ecc[1] = q2;

        for (college v:ecc){
            System.out.println(v.name + " : " + v.marketration + " : " + v.food);
        }
    }
}