import java.util.StringJoiner;

public class Programmer  extends Person {
     private String companyName;

    public Programmer(String name, String designation,String companyName ) {
        super(name, designation);
        this.companyName=companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

    public  void coding(){
        System.out.println("Kajdyi den pishet kod");

    }


    @Override
    public String toString() {
        return super.toString() +
                "companyName='" + companyName + '}';
    }
}
