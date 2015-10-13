sealed abstract class Shape

case class Circle(r: Int) extends Shape
case class Rectangle(h: Int, w: Int) extends Shape

val a:Shape = Circle(10)

val b:Shape = Rectangle(10, 20)


// def area(c: Circle) = 3.14 * c.r * c.r
// def area(r: Rectangle) = r.h * r.w


def area(a: Shape) = a match {
	case Circle(r) => 3.14 * r * r
	case Rectangle(h, w) => h * w
}

///////////////////////////////////////

def area2(a: Circle) =
	3.14 * a.r * a.r

def area2(b: Rectangle) = 
	b.h * b.w


val a2 = Circle(10)

val b2 = Rectangle(10, 20)

println(area(a))
println(area(b))

println(area2(a2))
println(area2(b2))
