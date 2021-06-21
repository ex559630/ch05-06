fun main(){
    runSimulation("Guyal"){ playerName:String , numBuildings:Int ->

        val currentYear = 2021
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
fun runSimulation(playerName: String, greetingFunction :(String,Int) -> String){
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName,numBuildings))
}