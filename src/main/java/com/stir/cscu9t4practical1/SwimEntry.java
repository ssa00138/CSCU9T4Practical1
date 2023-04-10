package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {


	private String where;
    
    /**
     * Constructor for objects of class Cycling
     */
public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ww )
{
// intialise instance variables
super(n, d, m, y, h, min, s, dist);
this.where= ww; 
 

}
public String getWhere() {
return where;
} 
public void setpool(String ww) {
this.where= ww;
} 

/**
* An example of a method - replace this comment 
* 
* @param y a sample parameter for a method 
* @return the sum of x and y 
*/

public String getEntry () {
String result = getName()+" ran " + getDistance() + " km in "
        +getHour()+":"+getMin()+":"+ getSec() + " on "
        +getDay()+"/"+getMonth()+"/"+getYear()+"\n" + getWhere() ;
return result;
}
}
