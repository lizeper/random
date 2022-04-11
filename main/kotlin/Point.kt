class Point(var x:Double, var y:Double) {

    fun invertirCoordinates(){
        var temp=this.y
        this.y=x
        this.x=temp
    }

    override fun toString():String{
        return "($x,$y)"
    }
}