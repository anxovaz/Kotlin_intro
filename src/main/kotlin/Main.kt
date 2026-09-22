fun main() {
    println("Hola \"Mundo\"")
    val x: Int = 5;
    val y = 3;
    println(x+y) //53


    var cantidad: Int = 10
    cantidad = 5
    cantidad+=2
    cantidad--
    println("Tienes $cantidad euros")

    var cantidad2: Double = cantidad.toDouble()
    println(cantidad2)

    var nombre: String = "anxo"
    var edad: Double = 21.5

    /*
     * Comentario de varias lineas
     */

    saludo("Anxo")
    saludo(apellido = "Lorenzo", nombre = "Anxo")

    val cantidad3 = "20"
    val cantidad4 = "30"
    println(cantidad3+cantidad4) //2030

    println(add(2,3))
}

fun saludo(nombre: String, apellido: String ="Vázquez"): Boolean {
    println("Hola $nombre $apellido")
    return true
}

fun add(valor1: Int, valor2: Int): Int {
    return valor1 + valor2
}