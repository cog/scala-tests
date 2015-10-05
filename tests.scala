// sum

def sum(n: Int): Int =
	if (n == 0) 0 else n + sum(n - 1)

def sumRec(n:Int, acc:Int): Int = 
	if (n == 0) acc else sumRec(n - 1, acc + n)

val sum1000 = sumRec(1000, 0)

if (sum(5) == sumRec(5, 0)) println("sum OK") else println("sum NOK")

// fac

def fac(n: Int): Int =
	if (n == 1) 1 else n * fac(n - 1)

def facRec(n: Int, acc: Int): Int =
	if (n == 1) acc else facRec(n - 1, acc * n)

val fac1000 = facRec(1000, 1)

if (fac(5) == facRec(5, 1)) println("fac OK") else println("fac NOK")
