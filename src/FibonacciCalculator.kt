package myexample.util

class FibonacciCalculator {

    fun fib(n: Int): Int {
        require(n >= 0) { "The Fibonacci index must be a non-negative number." }
        if (n == 0) return 0
        if (n == 1) return 1

        var prev = 0
        var curr = 1
        repeat(n - 1) {
            val next = prev + curr
            prev = curr
            curr = next
        }
        return curr
    }
}
