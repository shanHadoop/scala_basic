package skd.com.scalaLearning.curring_partial

// Currying is a means of transforming a function that takes more than one argument into a chain of calls to functions,
// each of which takes a single argument.
//
// Let us consider the function below to calculate the final price of the product. The function takes in 3 parameters:
//
// VAT (vat) for the region
// Service charge (serviceCharge) of the shop
// Product price (productPrice)

object CurringDemo1 {

val commission = 10/100
// in Non functional programming approach

 def finalPrice(vat: Double,
                 serviceCharge: Double,
                 productPrice: Double): Double =
    productPrice + productPrice*serviceCharge/100 + productPrice*vat/100


  // in  functional programming approach

  def finalPriceCurried(vat: Double)
                       (serviceCharge: Double)
                       (productPrice: Double): Double =
    (productPrice + productPrice*serviceCharge/100 + productPrice*vat/100) + commission


  //We are taking this approach because our vat and serviceCharge will not change very often.
  // So, let's use currying to split our method. We will declare a new val: vatApplied.
  // I will provide the value of vat to the finalPriceCurried method and assign it to vatApplied.
  val vatApplied = finalPriceCurried(20) _


  //Next, we will provide a service charge to my vatApplied val,
  // and we will leave the price to be provided by the shopkeeper whenever they need it.
  val serviceChargeApplied = vatApplied(12.5)


  val finalProductPrice = serviceChargeApplied(120)
 // finalProductPrice: Double = 159.0

}
