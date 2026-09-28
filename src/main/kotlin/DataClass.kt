data class dataClass (val datos: String, val datos2:String = "") {}
fun main(){
    val dc1 = dataClass("Agua")
    val dc2 = dataClass("Tierra")
    val dc3 = dataClass("Agua")

    println(dc1)
    println(dc1.equals(dc2))
    println(dc1.equals(dc3))

    println(dc1.datos)

    val dc4 = dataClass("Tierra", "Fuego")
    val (dato1, dato2) = dc4
    println(dato1)
    println(dato2)
    val (_, dato3) = dc4
    println(dato3)

}