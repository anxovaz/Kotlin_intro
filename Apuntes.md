# Variables

Se pueden hacer operaciones d esuma y resta con `int` y `string`, pero el resultado no es el esperado

```
    val x = "5";
    val y = 3;
    println(x+y)
    
    //Resultado 53
    
    val x = "5";
    val y = "3";
    println(x+y)
    
    //Resultado 53
    
    val x = 5;
    val y = 3;
    println(x+y)
    
    //Resultado 8
```

# `val` y `var`

`val` es para valores no mutables (constantes) y `var` es para mutables

```
var cantidad: Int = 10
    cantidad = 5
    println("Tienes $cantidad euros")
    
val cantidad: Int = 10
    cantidad = 5 //error
    println("Tienes $cantidad euros")
```

# Conversión de variables

```
var cantidad: Int = 5
var cantidad2: Double = cantidad.toDouble()
//resultado = 5.0
```

# Funciones

- `nombre: String` -> lo que recibe como argumento

- `: Boolean` -> lo que devuelve (omitir si no devolviese nada)

```
fun saludo(nombre: String): Boolean {
println("Hola $nombre")
return true
}
```

# `if, else, else if`

```
if(cantidad3 > cantidad4){
        println("$cantidad3 es mayor que $cantidad4")
    }else if(cantidad3 < cantidad4){
        println("$cantidad4 es mayor que $cantidad3")
    }else{
        println("Son iguales")
    }
```

# `if, for, while`

```
//while
    var contador: Int = 0
    var condicion: Boolean = true
    while (condicion) {
        if(contador < 5){
            contador++
            println("Vuelta número $contador")
        }else{
            condicion = false
        }
    }

    //for
    for(i in 1..5){
        println(i)
    }
```




