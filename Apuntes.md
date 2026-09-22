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



