package com.demo.rational

class Rational(n:Int, d:Int) {
  require(d!=0) //precondition which must be full filled by the caller if false then illegel argument exception would be thrown.
  private val g = gcd(n.abs,d.abs)
  val numer : Int = n/g
  val demon : Int = d/g
  
  override def toString = numer+"/"+demon
 
  def add(that:Rational):Rational =
    new Rational(numer*that.demon+that.numer*d,d*that.demon)
  
  def lessThan(that:Rational) = 
    this.numer*that.demon<that.numer*this.demon
  
    def max(that:Rational)  = 
    if (this.lessThan(that)) that else this
  
    def gcd(a:Int,b:Int): Int = 
      if(b==0)a else gcd(b,a%b)   //Ecluid's Algorithm to find GCD 
    
  
}


object Main {
  def main(arg:Array[String]){
    
    var oneThird = new Rational(1,3);
    var twoFourth = new Rational(22,44);
    println(twoFourth)
    println("Result:"+ (oneThird add twoFourth))
    println("lessthan :" + (oneThird max twoFourth))
  }
}