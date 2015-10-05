// sum

def sum(n: Int): Int =
	if (n == 0) 0 else n + sum(n - 1)

def sum_rec(n:Int, acc:Int): Int = 
	if (n == 0) acc else sum_rec(n - 1, acc + n)

val sum1000 = sum_rec(1000, 0)

if (sum(5) == sum_rec(5, 0)) println("sum OK") else println("sum NOK")

// fac

def fac(n: Int): Int =
	if (n == 1) 1 else n * fac(n - 1)

def fac_rec(n: Int, acc: Int): Int =
	if (n == 1) acc else fac_rec(n - 1, acc * n)

val fac1000 = fac_rec(1000, 1)

if (fac(5) == fac_rec(5, 1)) println("fac OK") else println("fac NOK")
