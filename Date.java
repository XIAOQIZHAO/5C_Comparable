/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
    public int compareTo( Object otherObj){
	return toString().compareTo(((Date)otherObj).toString());
	/*
	if (compare(y, ((Date)otherObj).y) == 0){
	    if (compare(m, ((Date)otherObj).m) == 0)
		return compare(d, ((Date)otherObj).d);
	    else
		return compare(m, ((Date)otherObj).m);
	}
	else
	    return compare(y, ((Date)otherObj).y);
	*/
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


    /*
    public int compare(int var1, int var2){
	if (var1 > var2) return 1;
	else if (var1 < var2) return -1;	
	else return 0;
    }
    */
}
