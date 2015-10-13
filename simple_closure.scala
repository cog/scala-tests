def sqr(x: Int) = x*x
def cube(x: Int) = x*x*x

def compose(f: Int=> Int, g:Int=>Int): Int=>Int =
	x => f(g(x))

val f = compose(sqr, cube)
println(f(2))

val a = List(1,2,3,4)

println(a.map(f))

println(a.map(cube).map(sqr))

def removeLowScores(a: List[Int], threshold: Int): List[Int] = 
	a.filter(score => score >= threshold) // the anonymous function here is the closure; it uses a variable - threshold - which is not in its local environment

val a2 = List(95, 87, 20, 45, 35, 66, 10, 15)

println(removeLowScores(a2, 30))