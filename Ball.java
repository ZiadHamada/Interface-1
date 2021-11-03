package program1;

public class Ball implements Tossable {
    private String brandName;

    @Override
    public void toss() {
    }
    
    public Ball(String brandName){
        this.brandName = brandName; 
    } 
    
    public String getBrandName(){
        return brandName;
    }
    public void bounce(){
    }
}
