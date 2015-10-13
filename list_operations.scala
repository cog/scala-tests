val a = List(1,2,3)
val b = Nil
val c = List()
val d = 0::a
val e = 0::b

println(b)
println(c)
println(d) // List(0,1,2,3)
println(e) // List(0)

