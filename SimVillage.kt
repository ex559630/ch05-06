fun main(){
    runSimulation()
}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyak"))
}
fun configureGreetingFunction():(String) -> String{
    val structureType ="hospitals"
    var numBuilings = 5
    return { playerName: String->
        val currentYear =2021
        numBuilings += 1
        println ("Adding $numBuilings $structureType")
        "welcome to SimVillage $playerName!(copying $currentYear)"
    }
}
fun printConstructionCost(numBuilding:Int){
    val cost = 500
    println("Costruction cost: ${cost * numBuilding}")
}