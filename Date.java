/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
    public int compareTo( Object otherObj){
	if (compare(y, ((Date)otherObj).getY()) == 0){
	    if (compare(m, ((Date)otherObj).getM()) == 0)
		return compare(d, ((Date)otherObj).getD());
	    else
		return compare(m, ((Date)otherObj).getM());
	}
	else
	    return compare(y, ((Date)otherObj).getY());
    }
    
    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int getY(){
	return y;
    }
    
    public int getM(){
	return m;
    }
    
    public int getD(){
	return d;
    }

    public int compare(int var1, int var2){
	if (var1 > var2) return 1;
	else if (var1 < var2) return -1;	
	else return 0;
    }
}
