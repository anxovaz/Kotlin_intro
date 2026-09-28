data class DataClass3(var cadena: String, var numero:Int) {
}
fun retorno (entrada: String): DataClass3 {
    val resultado = DataClass3("",0)
    if(entrada == "0")
        resultado.numero = 1
    else
        resultado.cadena = "color"

    return resultado
}

fun main() {
    println(retorno("negro").cadena)
    println(retorno("0").numero)
}