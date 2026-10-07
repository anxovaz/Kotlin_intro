package gestor_estados
fun main(){
    val g = GestorEstados()
    g.logs = false
    println("test1")
    runTest(2,(g.gestor(true, b = true)))
    runTest(3,(g.gestor(true, b = false)))

    println("test2")
    g.estado = 1
    runTest(2,(g.gestor(true, b = true)))
    runTest(3,(g.gestor(false, b = false)))

    println("test3")
    g.estado = 1
    runTest(2,(g.gestor(true, b = false)))
    runTest(4,(g.gestor(false, b = true)))

    println("test4")
    g.estado = 1
    runTest(1,(g.gestor(false, b = true)))


    println("test5")
    g.estado = 1
    runTest(2,(g.gestor(true, b = false)))
    runTest(4,(g.gestor(true, b = true)))

    println("test6")
    g.estado = 1
    runTest(2,(g.gestor(true, b = true)))
    runTest(4,(g.gestor(false, b = true)))

}
fun runTest(salidaEsperada: Int, salida: Int) {
    if(salidaEsperada == salida) {
        println("[OK] " + salidaEsperada + " == " + salidaEsperada)
    } else{
        println("[FAIL] " + salidaEsperada + " != " + salidaEsperada)
    }
}