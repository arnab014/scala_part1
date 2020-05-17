object factorial {

  def fact(n: Int): Int = {

    var f = 1

    for (i <- 1 to n) {
      f = f * i;

    }
    return f

  }                                               //> fact: (n: Int)Int
  
/* -----Ans of Exercise 1----------------------------------------------------- */

  val num1 : Double = 42.354562                   //> num1  : Double = 42.354562
  val num2 : Int = 3                              //> num2  : Int = 3
  //println(f"$num1%1.2f");
  println((math rint num1 * 100) / 100);          //> 42.35
  println(f"$num2%04.0f");                        //> 0003
  
/* -----Ans of Exercise 2 Both Part-------------------------------------------- */
  val x = 5                                       //> x  : Int = 5

  if (x % 1 == 0) {
    val y = fact(x)
    println(s"Factorial of $x is: $y ")
  } else { println("N/A"); }                      //> Factorial of 5 is: 120 


/* -----Ans of Exercise 3 ---------------------------------------------------- */

  val num = 6.7                                   //> num  : Double = 6.7
  val z:Int  = num.toInt                          //> z  : Int = 6
  val cal= (fact (z));                            //> cal  : Int = 720
  println(s"Factorial of $z is: $cal ")           //> Factorial of 6 is: 720 

}