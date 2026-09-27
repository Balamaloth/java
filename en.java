class human{
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }

    public int getage(){
        return age;
    }

    public void setage(int a ){
        age = a;
    }

}



public class en {
    public static void main(String[] args) {

        human obj = new human();
        obj.setname("Alice"); 
        obj.setage(30);
        System.out.println(obj.getname() + " : " +obj.getage());
    }
}