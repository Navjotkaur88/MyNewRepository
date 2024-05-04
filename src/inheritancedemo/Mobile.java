package inheritancedemo;

public class Mobile {

    String model;
    double version;
    String feature;
    public Mobile(String model, double version, String feature){
       this.model = model;
        this.version = version;
        this.feature = feature;
        //public void printMobileDetail()
    }
    public void printMobileDetail() {
        {
            System.out.println(model);
            System.out.println(version);
            System.out.println(feature);

        }
    }
}
