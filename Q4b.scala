object main extends App{
  //noOfAttendees= 120 + (15-Ticket price)/5*20
  //revenue=noOfAttendees*price
  //cost = 500 + 3 * noOfAttendees
  //profit= revenue - Cost
  //a=ticket price

  def noOfAttendees(a:Int):Int = 120+ (15-a)/ 5*20 //calculate the number of attendees by giving ticket price

  def revenue(a:Int):Int = noOfAttendees(a)*a //calculate the revenue by giving ticket price

  def cost (a:Int):Int = 500 + noOfAttendees(a)

  def profit(a:Int):Int = revenue(a) - cost(a)

  println(profit(20))

}
