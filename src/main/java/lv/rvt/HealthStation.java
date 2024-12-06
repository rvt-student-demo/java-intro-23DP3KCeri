package lv.rvt;

public class HealthStation {
    
    
    private int weighingCount = 0;
    
    
    public int weigh(Person person) {
        weighingCount += 1;
        return person.getWeight();
    }
        
    public void feed(Person person){
            
         person.setWeight(person.getWeight() + 1);
    }
    public int weighings(){
           
            
        return weighingCount;
    }
    
}

