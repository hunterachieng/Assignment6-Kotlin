fun main(){
    var car = Car("Honda", "Odssey","Black",7)
        car.carry(12)
        car.identity()
        println(car.calculateParkingFees(4))
    //second object from class Bus
    var bus = Bus("Volvo", "Mini-bus","Blue",25)
    bus.carry(20)
    bus.identity()
    println(bus.calculateParkingFees(5))
    println(bus.maxTripFare(100.50))

}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry (people:Int){
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers ")
        }else {
            println("“Over capacity by $x people”")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
   open fun calculateParkingFees(hours: Int):Int{
        return hours * 20
    }
}
class Bus (make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        return capacity * fare
    }
    override fun calculateParkingFees(hours: Int):Int{
        return hours * capacity
    }

}