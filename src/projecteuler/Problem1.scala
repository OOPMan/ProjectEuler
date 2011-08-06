package projecteuler

/**
 * Created by IntelliJ IDEA.
 * User: adamj
 * Date: 8/1/11
 * Time: 8:06 PM
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *  The sum of these multiples is 23.
 *
 *  Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Problem1 {

    // Solves the problem using a simple but stupid method
    def Stupid(min: Int, max: Int) = (for(num <- min to max if( (num % 3 == 0 ) || (num % 5 == 0) )) yield num).sum

    // Solves the problem using a more intelligent method that takes advantage of Arithmetic Progressions
    def Clever(min: Int, max: Int) =
        SumSeries(min, max, 3) + SumSeries(min, max, 5) - SumSeries(min, max, 15)

    def SumSeries(min: Int, max:Int, number: Int) =
        SumArithmeticProgression(if(min <= number) number else number * (min.toFloat / number).ceil.toInt, (max/number)*number, max / number).toInt

    def SumArithmeticProgression(first: Int, last: Int, length: Int) = ((first + last) / 2.0) * length




}