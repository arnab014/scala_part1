object fibonacci {
  def fibonacci(n: Int): Int =
    if (n < 3) 1
    else fibonacci(n - 1) + fibonacci(n - 2)      //> fibonacci: (n: Int)Int
  for { i <- 1 to 10 }
    println(fibonacci(i));                        //> 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
}
    
    