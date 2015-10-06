// a closure is a function which carries with it references to the environment in which it was defined

println("test 1")

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


//// with anonymous functions
println("test 2")

def fun10(y: Int): Int => Int =
	x => x + y

def fun20() = {
	val f = fun10(10)
	println(f(2))
}

fun20()

////
println("test 3")

def fun3(x: Int):Int => Int = {
	val y = x
	def add(c: Int) = c + y
	
	add
}

val f = fun3(1)
println(f(10))

val g = fun3(2)
println(g(10))
println(f(10)) // the closure is defined when it was created
