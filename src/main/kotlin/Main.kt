fun main(){
var travel = Car("subaru","toyota","maroon",10)
    travel.carry(16)
    travel.identity()
    println(travel.calculateParkingFees(5))

    var bus = Bus("scania","nissan","white",50)
    bus.maxTripFare(100.00)
    println(bus.calculateParkingFees(2))

}

open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if (people <= capacity){
            println("Carrying $people passengers ")
        }else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
fun identity(){
    println("I am a $color $make $model")
}

    open fun calculateParkingFees(hours:Int):Int{
        var fee = hours*20
        return fee

    }
}

class Bus(make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){
  fun maxTripFare(fare:Double):Double{
      var max=fare*capacity
      return max
  }    override fun calculateParkingFees(hours: Int): Int{
//        return super.calculateParkingFee(hours)
        var fee=hours*capacity
        return fee
    }




}


