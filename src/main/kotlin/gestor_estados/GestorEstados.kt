package gestor_estados

class GestorEstados {
    public var estado = 1
    public var logs = true //hace que los métodos impriman logs
    fun gestor(a: Boolean = true, b: Boolean = false): Int {
        if(this.estado == 1) {
            //a = false
            if (estado1(a) == 1){
                return this.estado
            }
            else{ //a= true
                //Pasa a estado 2 y se pausa, no pasa a estado 3 o 4
                estado2(b)
            }
        }else if(this.estado == 2) {
            //cambia los estados y ahí se queda
            if(estado2(b) == 4){
                estado4()
            }else{ //3
                estado3()
            }

        }else if(this.estado == 3) {
            if(this.logs){println("La máquina ya está en estado 3 (ha terminado)")}
            return this.estado

        }else { //estado 4
            //manda la máquina a estado 1 y ahí se queda
            estado1(a)
        }

        return this.estado
    }

    //Todos los métodos cambian el estado (this.estado), imprimen su estado y devuelven un entero del siguiente estado si es que hay, si no devuelve el suyo
    //ejemplo: estado1(true) -> 2 , estado1(false) -> 1

    fun estado1(a: Boolean = true): Int {
        this.estado = 1
        if(this.logs){println("estado 1")}
        if(a){
            return 2
        }
        return 1
    }

    fun estado2(b: Boolean = true): Int {
        this.estado = 2
        if(this.logs){println("estado 2")}
        if (b){
            return 4
        }else{
            return 3
        }
    }

    fun estado3(): Int {
        this.estado = 3
        if(this.logs){println("estado 3 - fin")}
        return 3
    }

    fun estado4(): Int {
        this.estado = 4
        if(this.logs){println("estado 4")}
        return 1
    }


}
fun main(){
    val g = GestorEstados()
    //estado1
    g.gestor(true, b = false)
    //estado2
    g.gestor(true, b = false)
    //estado 3 (ya no puede seguir)
    g.gestor(true, b = false)

    g.estado = 1 //reinicio volvioendo a estado 1

    //estado 1
    g.gestor(true, b = true)
    //estado 2
    g.gestor(true, b = true)
    //estado 4
    g.gestor(true, b = true)
    //estado 1
    g.gestor(true, b = true)
    //estado 2
}
