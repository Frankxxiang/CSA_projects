public class ScopeExample {
    private int totalMarks;
    private int subjects;
    public ScopeExample(int t_Marks,int sub){
        this.totalMarks=t_Marks;
        this.subjects=sub;

    }
    public void updateMarks(int marks1,int marks2,int marks3){
        totalMarks+=marks1+marks2+marks3;
        subjects+=3;
    }
    public double averageMarks(){
        return totalMarks/subjects;
    }
}