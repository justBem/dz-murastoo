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

   public  String  learn(){
       return "Kajdyi moment novoe";

    }
   public  String  walk(){
        return "Kajdyi den xodit na rabotu";

    }
    public   String  eat(){
        return "Kajdyi den obedaet v ofise";

    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' ;
    }
}

