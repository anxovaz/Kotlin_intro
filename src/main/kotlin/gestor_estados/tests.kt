package gestor_estados

fun main(){
    val g = GestorEstados()
    g.logs = false
    println("test1")
    println(g.gestor(true, b = true))
    println(g.gestor(true, b = false))

    println("test2")
    g.estado = 1
    println(g.gestor(true, b = true))
    println(g.gestor(false, b = false))

    println("test3")
    g.estado = 1
    println(g.gestor(true, b = false))
    println(g.gestor(false, b = true))

    println("test4")
    g.estado = 1
    println(g.gestor(false, b = true))


    println("test5")
    g.estado = 1
    println(g.gestor(true, b = false))
    println(g.gestor(true, b = true))

    println("test6")
    g.estado = 1
    println(g.gestor(true, b = true))
    println(g.gestor(false, b = true))

}