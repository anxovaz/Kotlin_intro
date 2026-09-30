package gestor_estados

class GestorEstados {
    fun gestor(a: Boolean = true, b: Boolean = false): Int {

        if (!estado1(a)){
            return 1
        }


        if(estado2(b)==3){
            estado3()
            return 3
        }else {
            if(estado4()==1) {
                gestor(false)
                return 1
            }
            return 4
        }
    }

    fun estado1(a: Boolean = true): Boolean {
        println("estado 1")
        if(a){
            return true
        }
        return false
    }

    fun estado2(b: Boolean = true): Int {
        println("estado 2")
        if (b){
            return 3
        }else{
            return 4
        }
    }

    fun estado3(): Int {
        println("estado 3 - fin")
        return 3
    }

    fun estado4(): Int {
        println("estado 4")
        return 1
    }


}
fun main(){
    val g = GestorEstados()
    g.gestor(true, b = false)
}