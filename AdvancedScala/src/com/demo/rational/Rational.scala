package com.demo.rational

class Rational(n:Int, d:Int) {
  require(d!=0) //precondition which must be full filled by the caller if false then illegel argument exception would be thrown.
  val numer : Int = n;
  val demon : Int = d;
  override def toString = n+"/"+d
  def add(that:Rational):Rational =
    new Rational(numer*that.demon+that.numer*d,d*that.demon)
  def lessThan(that:Rational) = 
    this.numer*that.demon<that.numer*this.demon
  def max(that:Rational)  = 
    if (this.lessThan(that)) that else this
}


object Main {
  def main(arg:Array[String]){
    
    var oneThird = new Rational(1,3);
    var twoFourth = new Rational(2,4);
    
    println("Result:"+ (oneThird add twoFourth))
    println("lessthan :" + (oneThird max twoFourth))
  }
}