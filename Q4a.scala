object main extends App{

  def basicSalary(hours:Int):Int = hours*250

  def ot(hours:Int):Int = hours*85

  def income(h1:Int,h2:Int):Int = basicSalary(h1) + ot(h2)

  def tax(income:Int):Double = income*0.12

  def totalSalary(h1:Int,h2:Int):Double = income(h1,h2) - tax(income(h1,h2))

  println(totalSalary(10,10))
}
