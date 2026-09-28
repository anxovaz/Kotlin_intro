data class DataClass2(val color: String = "negro", val numero: Int = 1 )

fun main() {
    var numero: Int = 0
    if (numero == 0) {
        println((DataClass2().numero::class.simpleName))
    }else if (numero == 1){
        println((DataClass2().color::class.simpleName))
    }else{
        println("Valor incorrecto")
    }
}