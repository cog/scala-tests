// a closure is a function which carries with it references to the environment in which it was defined

def fun1():Int => Int = {
	val y = 1
	def add(x: Int) = x + y
	
	add
}

def fun2() = {
	val y = 2
	
	// this function is still going to use the y value defined within fun1()
	val f = fun1()
	
	println(f(10))
}

fun2()
