// fun returns a function of type Int => Int

def sqr(x: Int):Int = x * x * x

def fun():Int => Int = {
	def sqr(x: Int):Int = x * x
	
	sqr
}

val f = fun()
println(f(10))