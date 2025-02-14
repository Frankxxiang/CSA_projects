

public class Pet {
/**
 * @author
 * @
 */
    private String name;
    private String type;
    private int age;
    private double weight;
    private String breed;
    public Pet(){
        name= "unknown";
        type="unknown";
        age= 0;
        weight=0;
        breed="unknown";
    }
    public Pet(String name, String type,String breed,int age,double weight){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.weight=weight;
        this.type=type;
    }
    public String getinfo(){
        return "The name of the pet is: "+ name+"\n"+
        "The age of the dog is: "+age+"\n"+
        "The weight of the dog is: "+ weight+"\n"+
        "The type of the dog is: "+ type+"\n"+
        "The breed of the dog is: "+ breed+"\n"
        ;
    }
    public String toString(){
        return "Name: "+ name+"\n"+
        "Age : "+age+"\n"+
        "weight : "+ weight+"\n"+
        "Type : "+ type+"\n"+
        "Breed: "+ breed+"\n"
        ;
    }
    public void Setter(String name, String type,String breed,int age,double weight){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.weight=weight;
        this.type=type;
    }
}
