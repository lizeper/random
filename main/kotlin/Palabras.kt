class Palabras(var frase: String) {



    var palabras = 1


    fun contarEspacios(): Int {
        for (i in frase) {
            if (i == ' ') {

                palabras += 1
            }
        }
        return palabras
    }
}


