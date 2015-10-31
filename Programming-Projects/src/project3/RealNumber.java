/**
 * 
 */
package project3;

/**
 * @author Josh Reichman
 *
 */
public class RealNumber {
 private int precision;
 private boolean isNegative;
 private byte[] data;

 public static void main(String[] args)
	{	
	 System.out.print(new RealNumber(8,true, new byte[]{3,4,3,2,7}).toString());
	}
 /**
  * @param precision
  * @param isNegative
  * @param data
  */
 public RealNumber(int precision, boolean isNegative, byte[] data) {
  this.precision = precision;
  this.isNegative = isNegative;
  if (precision > data.length) {
   this.data = new byte[precision];
   for(int i = 0; i < data.length; i++){
    this.data[i] = data[i];
   }
   //for(int i = data.length -1 ; i < data.length;i++){ //check this out
    //this.data[i] = 0; 
   }
  }

 public RealNumber(int precision, String value) {

 }

 /**
  * @return Precision
  */
 public int getPrecision() {
  return precision;
 }

 /**
  * @return isNegative
  */
 public boolean isNegative() {
  return isNegative;
 }

 /**
  * @return data
  */
 public byte[] getData() {
  return data;
 }

 @Override
 public String toString() {
  
  StringBuilder sb = new StringBuilder();
  if(this.isNegative())
   sb.append("-");
  
  if(this.getPrecision() > this.getData().length - 1){ 
   sb.append(".");
   for(int i = this.getPrecision(); i > 0; i--){
    if(i > this.getData().length-1){
     sb.append("0");
    }
    else {
     sb.append(this.data[i-1]);
    }
   }
   
  }
  else if(this.getPrecision() < this.getData().length){ //over flow data goes past decimal point
   boolean leadingZero = true;
   
  }
return sb.toString();
 }
 /*
 public static int compare(RealNumber value1, RealNumber value2) {
  
 }

 public int compareTo(RealNumber value) {

 }

 @Override
 public boolean equals(Object o) {

 }

 public static RealNumber add(RealNumber value1, RealNumber value2) {

 }

 public static RealNumber subtract(RealNumber value1, RealNumber value2) {

 }

 public static RealNumber multiply(RealNumber value1, RealNumber value2) {

 }

 public static RealNumber divide(RealNumber value1, RealNumber value2) {

 }

 public static RealNumber squareRoot(RealNumber value) {

 }
 */
}