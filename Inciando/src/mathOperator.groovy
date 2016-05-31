class MathOperator{
  static void main (String[] args){
    def randNum = 2.0;

    println("Math.abs (-2.45) = " + (Math.abs(-2.45)));
    println("Math.round (2.45) = " + (Math.round(2.45)));

    println("randNum.pow(3) = " + (randNum.pow(3)));

    println("3.0.equals(2.0) " + (3.0.equals(2.0))); //false

    println("randNum.equals(Float.NaN) " + (randNum.equals(Float.NaN)));

    println("Math.sqrt(9) = " + (Math.sqrt(9)));
    println("Math.cbrt(27) = " + (Math.cbrt(27)));
    println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
    println("Math.min(2,3) = " + (Math.min(2,3)));
    println("Math.max(2,3) = " + (Math.max(2,3)));

  }
}
