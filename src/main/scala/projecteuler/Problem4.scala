package projecteuler

/**
 * Created by IntelliJ IDEA.
 * User: adamj
 * Date: 8/7/11
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 *
 * A palindromic number reads the same both ways.
 *
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

object Problem4 {
    val threeDigitNumbers = 100 to 999

    /**
     * A functon the returns list of tuples consisting of:
     * * first multiplicand
     * * second multiplicand
     * * numeric palindrome
     */
    def DebugPalindromes(range: Seq[Int]) =
        for {
            n <- range
            m <- range
            x = n * m
            y = x.toString
            if y.length % 2 == 0 && y.slice(0, y.length / 2) == y.slice(y.length / 2, y.length).reverse
        } yield (n, m, x)

    def Palindromes(range: Seq[Int]) = for((_,_,palindrome) <- DebugPalindromes(range)) yield palindrome

    def Stupid = Palindromes(threeDigitNumbers).max

    def Clever = {
        //TODO: Come up with a better way to do it
    }

}