class Palindromas {


    fun palabrasPa(palabras: String):String{
        var count = palabras.length - 1

        for (i in palabras.indices) {

            if ( palabras[i] == palabras[count]) {
                count -= 1

            } else {
                return " la palabra $palabras NO es palindromo"
            }

        }

        return " la palabra $palabras es palindromo"
    }



}
