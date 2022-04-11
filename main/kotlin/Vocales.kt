class Vocales {

    fun vocales(palabra:String):Int{
        var count=0
        for(i in palabra){
            if (i=='a'){
                count+=1
            }
            if (i=='e'){
                count+=1
            }
            if (i=='i'){
                count+=1
            }
            if (i=='o'){
                count+=1
            }
            if (i=='u'){
                count+=1
            }
        }
        return count
    }
}