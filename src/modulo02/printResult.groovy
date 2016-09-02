package modulo02

class PrintResult{
  static void main (String[] args){
    println("Helo Word");

    def age = "Dog";
    age = 40;

    println("5 + 4 = " + (4 + 4));
    println("5 - 4 = " + (5 - 4));
    println("5 * 4 = " + (5 * 4));
    println("5 / 4 = " + (5.intdiv(4)));
    println("5 % 4 = " + (5 % 4));

    println("3 + 2 * 5 = " + (3 + 2 * 5));
    println("(3 + 2) * 5 = " + ((3 + 2) * 5));

    println("age++ = " + (age++));
    println("++age = " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));

  }
}
