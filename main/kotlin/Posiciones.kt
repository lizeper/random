import kotlin.math.E

class Posiciones {

    val lista: MutableList<Int> = mutableListOf()
    val lista2: MutableList<Int> = mutableListOf()
    fun repetidos(num: Int, lista: MutableList<Int>):String {
        var count = 0
        var resul=""

        for (j in lista.indices) {
            if (lista[j] == num) {
                count += 1
                lista2.add(j)


            }

        }

        if (count == 0) {
            resul="NO"
        } else{
            resul="Esta $count veces en las posiciones $lista2"
        }

        return resul
    }


}



