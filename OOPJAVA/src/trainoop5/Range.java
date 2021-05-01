
package trainoop5;


public class Range {
    private int min;
    private int max;

    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }
    
    public boolean inRange(int age){
    return age>=min&&age<=max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Range{" + "min=" + min + ", max=" + max + '}';
    }
    
    
            
}
