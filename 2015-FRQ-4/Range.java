import java.util.List;
public class Range implements NumberGroup{
    private int max;
    private int min;
    
    private List<NumberGroup> groupList; 
    
    //Sets the variables min and max to the parameters of the constructor
    public Range(int min, int max){
        this.min=min;
        this.max=max;
    }
    
    /*
    public boolean contains(int num){
        return num >= min && num <= max;
    }
    */
    
   
    //Theoretical boolean statement contains if MultipleGroups is already provided
    public boolean contains(int num){
        for (NumberGroup group: groupList){
            if (group.contains(num)){
                return true;
            }
        }
        return false;
    }
}