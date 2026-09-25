class Aquario {
    var ancho: Int = 0
    var largo: Int = 0
    val alto: Int = 5
    var litrosLlenados: Int = 0
    val encargadoMantenimiento: String = "Pepe"
    var volumen: Int
        get() = largo * ancho * alto
        set(valor) {
            largo = valor
        }
    init{
        println("Inicializando Aquario")
    }

    constructor(ancho: Int = 100, largo: Int = 40, litrosLlenados: Int = 3000) {
        this.ancho = ancho
        this.largo = largo
        this.litrosLlenados = litrosLlenados
    }

    fun mostrar(): String {
        return "Llenados: $litrosLlenados litros \nAncho: $ancho \nLargo: $largo \nEncargado mantenimiento: $encargadoMantenimiento"
    }

}
fun main() {
    val aquario = Aquario(largo = 50)
    println(aquario.mostrar())
    println("---")
    aquario.litrosLlenados = 2000
    println(aquario.mostrar())
}