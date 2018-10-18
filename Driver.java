public class Driver { //

  public static void main(String[] args) {
    System.out.println();

    // RealNumber testing!!!
    System.out.println("Testing RealNumber class (the easy part!!! hopefully!!!)");
    System.out.println("----------");
    RealNumber p = new RealNumber(1.0);
    RealNumber q = new RealNumber(2.0);

    // toString, RealNumber(s)
    System.out.print("Real Number p (should print 1.0): ");
    System.out.println(p);
    System.out.print("Real Number q (should print 2.0): ");
    System.out.println(q);
    System.out.println("----------");

    // RealNumber opeations
    System.out.print("p + q (should print 3.0): ");
    System.out.println(p.add(q));
    System.out.print("p - q (should print -1.0): ");
    System.out.println(p.subtract(q));
    System.out.print("p * q (should print 2.0): ");
    System.out.println(p.multiply(q));
    System.out.print("p / q (should print 0.5): ");
    System.out.println(p.divide(q));

    System.out.println();

    // RationalNumber testing!!!
    System.out.println("Testing RationalNumber class");
    System.out.println("----------");

    RealNumber      a = new RationalNumber(-1,-2);
    RealNumber      b = new RationalNumber(5,20);
    RationalNumber  c = new RationalNumber(4,-8);
    RationalNumber  d = new RationalNumber(0,4);
    RationalNumber  e = new RationalNumber(4,0);
    RationalNumber  f = new RationalNumber(-20,-5);

    // testing methods, RationalNumber(s)

    System.out.print("Rational Number a (should print 1/2): ");
    System.out.println(a);
    System.out.print("Rational Number b (should print 1/4): ");
    System.out.println(b);
    System.out.print("Rational Number c (should print -1/2): ");
    System.out.println(c);
    System.out.print("Rational Number d (should print 0/1): ");
    System.out.println(d);
    System.out.print("Rational Number e (should print 0/1): ");
    System.out.println(e);
    System.out.print("Rational Number f (should print 4/1): ");
    System.out.println(f);
    System.out.println("----------");

    System.out.print("'RealNumber' representation of a (should print 0.5): ");
    System.out.println(a.getValue());
    System.out.print("'RealNumber' representation of b (should print 0.25): ");
    System.out.println(b.getValue());
    System.out.print("'RealNumber' representation of c (should print -0.5): ");
    System.out.println(c.getValue());
    System.out.print("'RealNumber' representation of d (should print 0.0): ");
    System.out.println(d.getValue());
    System.out.println("----------");

    System.out.print("Reciprocal of Rational Number a (should print 2): ");
    System.out.println(((RationalNumber)a).reciprocal());
    System.out.print("Reciprocal of Rational Number b (should print 4): ");
    System.out.println(((RationalNumber)b).reciprocal());
    System.out.print("Reciprocal of Rational Number c (should print -2): ");
    System.out.println(c.reciprocal());
    System.out.println("Reciprocal of Rational Number d (should print... eh let's not go there)");
    System.out.println("----------");

    System.out.print("[a == a] (should print true): ");
    System.out.println(((RationalNumber)a).equals(a));
    System.out.print("[a == b] (should print false): ");
    System.out.println(a.equals(b));
    System.out.print("[a == c] (should print false): ");
    System.out.println(a.equals(c));
    System.out.println("----------");

    System.out.print("Numerator of Rational Number c (should print -1): ");
    System.out.println(c.getNumerator());
    System.out.print("Denominator of Rational Number c (should print 2): ");
    System.out.println(c.getDenominator());
    System.out.println("----------");

    // RationalNumber operations
    System.out.print("a + c (should print 0): ");
    System.out.println(((RationalNumber)a).add(c));
    System.out.print("a - c (should print 1.0): ");
    System.out.println(a.subtract(c));
    System.out.print("a * c (should print -1/4): ");
    System.out.println(((RationalNumber)a).multiply(c));
    System.out.print("a / c (should print -1.0): ");
    System.out.println(a.divide(c));
    System.out.println("-----------");

    //Operations combining RationalNumber and RealNumber
    RealNumber rea1 = new RealNumber(1.0);
    RationalNumber rat1 = new RationalNumber(5,2);
    System.out.println("Testing operations combining RealNumber and RationalNumber");
    System.out.println("rea1: " + rea1);
    System.out.println("rat1: " + rat1);
    System.out.println("rea1.add(rat1) should return 3.5: " + rea1.add(rat1));
    System.out.println("rat1.add(rea1) should return 3.5: " + rat1.add(rea1));
    System.out.println("rea1.subtract(rat1) should return -1.5: " + rea1.subtract(rat1));
    System.out.println("rat1.subtract(rea1) should return 1.5: " + rat1.subtract(rea1));
    System.out.println("rea1.divide(rat1) should return 0.4: " + rea1.divide(rat1));
    System.out.println("rat1.divide(rea1) should return 2.5: " + rat1.divide(rea1));
    System.out.println("rea1.multiply(rat1) should return 2.5: " + rea1.multiply(rat1));
    System.out.println("rat1.multiply(rea1) should return 2.5: " + rat1.multiply(rea1));
    System.out.println("rat1 and rea1 should remain unchanged");
    System.out.println("rat1 should be 5/2: "+ rat1);
    System.out.println("rea1 should be 1.0: "+ rea1);

    // Time to break your code
    System.out.println("\noverflow problems?");
    c = new RationalNumber(-2147483648, 2147483647); System.out.println("c = "+c);
    d = new RationalNumber(2147483647, -1073741824); System.out.println("d = "+d);
    System.out.println("c * d (should print 2): "+c.multiply(d));
  }

}
