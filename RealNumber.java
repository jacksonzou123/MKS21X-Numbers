public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
    return this.getValue() + (double)other.getValue();
  }
  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return this.getValue() * (double)other.getValue();
  }
  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    if (other.getValue() != 0) {
	     return this.getValue() / (double)other.getValue();
    }
    return 0;
  }
  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return this.getValue() - (double)other.getValue();
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+ getValue();
  }
}
