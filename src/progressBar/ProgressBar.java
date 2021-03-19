package progressBar;

import java.awt.*;

public class ProgressBar extends javax.swing.JProgressBar {
    private int count=0;
    private int maxValue=100;
    private int minValue=0;
    
    public void setMaxValue(int max) {
        maxValue = max;
    }
    
    public void setMinValue(int min) {
        minValue = min;
    }
    
    public long getMaxValue() { 
        return maxValue; 
    }
    
    public long getMinValue() { 
        return minValue; 
    }    
    
    public void increment () {
        if (count < maxValue) {
            count++;
            this.setValue(count);
        }
    }
    
    public void decrement () {
        if (count > minValue) {
            count--;
            this.setValue(count);
        }
    }
}
