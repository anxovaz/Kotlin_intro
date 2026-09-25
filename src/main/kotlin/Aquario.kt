open class Aquario { //You must mark a class as open to allow it to be subclassed. Similarly, you must mark properties and member variables as open, in order to override them in the subclass.
    var ancho: Int = 0
    var largo: Int = 0
    val alto: Int = 5
    open val forma = "Rectangular"
    open var agua: Double = 0.0
        get() = volumen * 0.9
    var litrosLlenados: Int = 0
    val encargadoMantenimiento: String = "Pepe"
    var volumen: Int
        get() = largo * ancho * alto
        set(valor) {
            ancho = valor
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
        return "Llenados: $litrosLlenados litros \nAncho: $ancho \nLargo: $largo \nEncargado mantenimiento: $encargadoMantenimiento\nVolumen: $volumen"
    }

}
fun main() {
    val aquario = Aquario(largo = 50)
    println(aquario.mostrar())
    println("---")
    aquario.litrosLlenados = 2000
    aquario.volumen = 2000
    println(aquario.mostrar())

    println("---")
    crearPez()
}

fun crearPez() {
    val manta = Manta()
    println(manta.color)
    manta.comer()

}