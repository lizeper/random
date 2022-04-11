val pares: MutableList<Int> = mutableListOf()
val impares: MutableList<Int> = mutableListOf()

fun main(args: Array<String>) {
    println("Hello World!")
    metodo(2)
    metodo(2)
    metodo(3)


    imprimirLista(pares)
    imprimirLista(impares)
}

fun metodo(num: Int) {
    if (num % 2 == 0) {


        if (!validarExiste(num, pares)) {
            pares.add(num)
        }

    } else {
        if (!validarExiste(num, impares)) {
            impares.add(num)
        }
    }
}


fun validarExiste(num: Int, lista: List<Int>): Boolean {
    var existe = false

    for (i in lista) {
        if (num == i) {
            existe = true
            break
        }
    }

    return existe
}

fun imprimirLista(list: List<Int>) {
    for (i in list) {
        if(list==pares){
        print("lista pares  $i")
        }else{
            print("lista impares:  $i")
        }
    }
    println()
}

/**  fun validarExiste( lista2: List<Int>): Boolean {
var existe = false

for (i in lista2) {
if (num == i) {
existe = true
break
}
}

return existe**/
