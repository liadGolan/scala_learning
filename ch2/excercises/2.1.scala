def fib(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, prev: Int, current: Int): Int = {
        if (n <= 0) current
        else go(n - 1, prev = prev + current, current = prev)
    }

    go(n, prev = 1, current = 0)
}