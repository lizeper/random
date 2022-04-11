class VersionTriangulo(var punto1:Point,var punto2:Point) {
    var area: Double? = null
    var perimetro: Double? = null

    init {
        area=(punto2.x - punto1.x) * (punto2.y - punto1.y)
        perimetro=2 * (punto2.x - punto1.x) + 2 * (punto2.y - punto1.y )
    }
}