case class Circle(r: Int)

case class Rectangle(h: Int, w: Int)

val a = Circle(10)
println(a.r) // radius of the circle is 10

val b = Rectangle(5, 7)
println(b.h) // height of the rectangle is 5


def area(c: Circle) = 3.14 * c.r * c.r
def area(r: Rectangle) = r.h * r.w

println(area(b))

