public class snack {
    private String name;
    private int Calories;
    public snack(){
        this.name="";
        this.Calories=0;
    }
    public snack(String name, int cal){
        this.name=name;
        this.Calories=cal;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getcal(){
        return this.Calories;
    }
    public void setcal(int cal){
        this.Calories=cal;
    }
}
