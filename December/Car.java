public class Car {
    private String model;
    private int year;
    public Car(){
        model = "";
        year = 2019;
    }
    public Car(String inimodel,int intyear){
        this.model=inimodel;
        this.year = intyear;
    }
    public void print(){
        System.out.println("the car's model is: "+model);
        System.out.println("the car's year is: "+ year);
    }
}
