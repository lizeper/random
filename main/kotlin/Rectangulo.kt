class Rectangulo(var punto1:Point, var punto2:Point) {


    fun area(): Double {
        return (punto2.x - punto1.x) * (punto2.y - punto1.y)
    }

    fun perimetro(): Double {
        return 2 * (punto2.x - punto1.x) + 2 * (punto2.y - punto1.y )
    }


}