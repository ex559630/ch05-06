fun main(){
    runSimulation("Guyal",::printConstructionCost) { playerName , numBuildings ->
        val currentYear = 2021
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction :(String,Int) -> String) {
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))
}
fun printConstructionCost(numBuilding:Int){
    val cost = 500
    println("Costruction cost: ${cost * numBuilding}")
}