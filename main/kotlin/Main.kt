import kotlin.collections.mutableListOf as mutableListOf

fun main(args: Array<String>) {


    // var contar = Palabras("hola hol hoa holaa aaaa")
// println(contar.contarEspacios())
  //var contarVocales=Vocales()
   // println(contarVocales.vocales("hola"))

    //  var pa =Palindromas()
    //println(pa.palabrasPa("tannat"))

    //var order=OrganizarLista()
    //println(order.ordenar(mutableListOf(6,3,8,5,7)))

    //var posiciones=Posiciones()
   // println(posiciones.repetidos(4,mutableListOf(3,0,4,0)))

    var randomLis=ListaRandom()
    println(randomLis.organizaRandom(4))

}
   // var areaTriangulo=Rectangulo(Point(1.0,1.0),Point(4.0,6.0))
    //println(areaTriangulo.area())
    //println(areaTriangulo.perimetro())

    //var  rectangulo=VersionTriangulo(Point(1.0,1.0),Point(4.0,6.0))
   // println(rectangulo.area)
    //println(rectangulo.perimetro)

   /** val lista:MutableList<Int> = mutableListOf(2,6,3,4,5,7,1)
    //val list2:MutableList<Int> = mutableListOf()


    while (list2.size!=lista.size){
        var temp= 9999999
        val temp2 = if(list2.size != 0){
            list2[list2.size-1]
        } else {
            0
        }


        for (i in lista){
            if (temp2<i && i<=temp){
                temp=i
            }
        }

        list2.add(temp)
        println(list2)
    }


    /**var punto=Point(3.0,2.0)
    println(punto.invertirCoordinates())
    println(punto.toString())
    punto.x=7.0
    println(punto.toString())
    punto.y=5.0
    punto.invertirCoordinates()
    println(punto.toString())

    var punto2=Point(2.0,2.0)
    if(punto.x==punto2.x){
        println("si")
    }else{
        println("no")
    }

    var punto1=Point(3.0,2.0)
    println("point 1: $punto1")
    punto1.invertirCoordinates()
    println("invertir the x coodinate of point 1 is ${punto1.x}")
    punto1.x=0.0
    println("The x coodinate to 0 point 1 : ${punto1}")
**/