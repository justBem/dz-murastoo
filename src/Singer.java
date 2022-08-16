public class Singer extends Person {
    private String bandName;
    public Singer(String name, String designation,String bandName) {
        super(name, designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public  void singing(){
        System.out.println("Poet amirakanskie muzyki");

    }
    public  void playGitar(){
        System.out.println("Igraet na komuze");
    }


    }



