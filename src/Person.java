public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation){
        this.name=name;
        this.designation=designation;
    }
    public  String getName(){
        return name;
    }

    public String getDesignation() {
        return designation;
    }

   public  void learn(){
       System.out.println("Kajdyi moment novoe");

    }
   public  void walk(){
       System.out.println("Kajdyi den xodit na rabotu");

    }
    void eat(){
        System.out.println("Kajdyi den obedaet v ofise");

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
