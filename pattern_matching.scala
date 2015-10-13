def fun(a: List[Int]) = a match {
	case List(0, p, q) => p + q
	case _ => -1
}

println(fun(List(0, 10, 20)))
println(fun(List(0, 1, 2, 3)))
println(fun(List(1, 10, 20)))

def fun2(a: List[Int]) = a match {
	case List(0, p, q) => p + q
	case List() => -1
}

def length(a: List[Int]):Int = a match {
	case Nil => 0
	case h::t => 1 + length(t)
}

println(length(List()))
println(length(List(10,20,30,40)))
