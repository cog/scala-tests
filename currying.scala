def addA(x: Int, y: Int): Int =
	x + y

def addB(x: Int):Int => Int =
	y => x + y

val a = addA(10, 20)
val b = addB(10)(20)

println(a)
println(b)

// three argument functions

def addA3(x: Int, y:Int, z: Int) = 
	x + y + z

def addB3(x: Int): Int => (Int => Int) = 
	y => (z => x + y + z)

val a3 = addA3(1, 2, 3)
val b3 = addB3(1)(2)(3)

println(a3)
println(b3)