/**
  * Created by Own on 2/6/2019.
  */

 /* Write a product function that calculates the product of the values of a function for the points on a
    given interval? As a second exercise, once you have product can you write factorial in terms of it?
    And the third part of the exercise would be, can you think of a more general function which generalizes
    both sum and product? */


 def mapReduce(f: Int => Int, combine:(Int,Int) => Int, zero:Int)(a:Int,b:Int):Int={
   if (a>b) zero
   else combine(f(a),mapReduce(f, combine,zero)(a+1,b))
 }

/* Initial product function
def product(f:Int=> Int)(a:Int,b:Int):Int ={
  if (a > b) 1
  else f(a) * product(f)(a+1,b)
}

*/

def product(f:Int=>Int)(a:Int, b:Int):Int = mapReduce(f,(x,y) => x*y,1)(a,b)
    //product(x = > x*x)(3,4) = 144


def fact(n:Int) = product(x => x)(1,n)
    //fact (5) = 120



