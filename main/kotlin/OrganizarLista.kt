class OrganizarLista {


    val lista2: MutableList<Int> = mutableListOf()


    fun ordenar(lista1: MutableList<Int>): MutableList<Int> {
        for (j in lista1) {

            var num =999999
            for (i in lista1) {
                if (i < num) {
                    if (!validarExiste(i,lista2)) {
                        num = i
                    }
                }
            }
            lista2.add(num)

        }
        return lista2
    }

    fun validarExiste(num1:Int,lista2: List<Int>): Boolean {
        var existe = false

        for (i in lista2) {
            if (num1 == i) {
                existe = true
                break
            }
        }

        return existe
    }
}

