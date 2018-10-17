public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if (denominator == 0) {
      numerator = 0;
      denominator = 1;
    }
    reduce();
  }

  public double getValue(){
    return this.getNumerator()/this.getDenominator();
  }


  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(this.getDenominator(),this.getNumerator());
  }

  public boolean equals(RationalNumber other){
    if (this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator()) {
      return true;
    }
    if (this.getNumerator() == 0 && other.getNumerator() == 0) {
      return true;
    }
    return false;
  }

  public String toString(){
    if (getNumerator() == 0 || getDenominator() == 1) {
	return "" + getNumerator();
    }
    if (getNumerator() < 0 && getDenominator() < 0 || getNumerator() > 0 && getDenominator() > 0) {
    	return "" + getNumerator() + "/" + getDenominator();
    }
    return "-" + getNumerator() + "/" + getDenominator();
  }

  public static int gcd(int a, int b){
    /*use euclids method or a better one*/
    int large = Math.abs(a);
    int small = Math.abs(b);
    if (b > large) {
      large = Math.abs(b);
      small = Math.abs(a);
    }
    boolean x = true;
    int remainder = 0;
    while (x) {
       remainder = large % small;
       if (remainder == 0) {
         return small;
       }
       large = small;
       small = remainder;
    }
    return 0;
  }



  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int g = gcd(getNumerator(),getDenominator());
    numerator = getNumerator()/g;
    denominator = getDenominator()/g;
  }


  /******************Operations!!!!****************/


  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(this.getNumerator()*other.getNumerator(),this.getDenominator()*other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int thisN = this.getNumerator() * other.getDenominator();
    int D = this.getDenominator() * other.getDenominator();
    int otherN = other.getNumerator() * this.getDenominator();
    return new RationalNumber(thisN + otherN, D);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int thisN = this.getNumerator() * other.getDenominator();
    int D = this.getDenominator() * other.getDenominator();
    int otherN = other.getNumerator() * this.getDenominator();
    return new RationalNumber(thisN - otherN, D);
  }
}
