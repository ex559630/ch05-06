fun main(){
    runSimulation()
}
fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyak"))
    println(greetingFunction("Guyak"))
}
fun configureGreetingFunction():(String) -> String{
    val structureType ="hospitals"
    var numBuildings = 5
    return { playerName: String->
        val currentYear =2021
        numBuildings += 1
        println ("Adding $numBuildings $structureType")
        "welcome to SimVillage $playerName!(copying $currentYear)"
    }
}
fun printConstructionCost(numBuilding:Int){
    val cost = 500
    println("Costruction cost: ${cost * numBuilding}")
}