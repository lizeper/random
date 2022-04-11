import java.util.*
import kotlin.random.Random.Default.nextInt

class ListaRandom {

    var lista:MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    var lista2:MutableList<Int> = mutableListOf()

    fun organizaRandom (num:Int):MutableList<Int>{


        for (i in lista.indices) {
            if (lista[i]<=num) {

                lista2.add(lista.random())

            }

        }
        return lista2


    }
}