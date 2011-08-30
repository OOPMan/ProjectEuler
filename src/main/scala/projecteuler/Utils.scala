package projecteuler

/**
 * Created by IntelliJ IDEA.
 * User: adamj
 * Date: 7/31/11
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */

object Utils {
    /**
     * This function can be used to time the execution of some random piece of code as follows:
     *
     * Utils.time {
     *     val a = 1 + 2
     *     return a
     * }
     *
     * The anonymous code timed must return a single value which can be of Any type
     *
     * This function returns a tuple containing the return value of the anonymous code and the execution time in milliseconds
     */
    def time(func: => Any): (Any, Long) = {
        val start = System.currentTimeMillis()
        val ret = func
        val end = System.currentTimeMillis()
        return (ret, end - start)
    }

    /**
     * Uses time to run a fragment of anonymous code and prints out the time to run as well as the result
     */
    def printTimed(func: => Any) {
        val result = time(func)
        println("Result:" + result._1)
        println("Time in seconds:" + result._2.toFloat / 1000.0)
    }
}

