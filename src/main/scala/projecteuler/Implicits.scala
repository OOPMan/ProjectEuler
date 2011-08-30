package projecteuler

/**
 * Created by IntelliJ IDEA.
 * User: adamj
 * Date: 8/7/11
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */

object Implicits {
    implicit def intToFloat(i: Int): Float = i.toFloat
    implicit def intToString(i: Int): String = i.toString

    implicit def floatToInt(f: Float): Int = f.toInt
    implicit def floatToString(f: Float): String = f.toString

    implicit def stringToInt(s: String): Int = java.lang.Integer.parseInt(s)
    implicit def stringToFloat(s: String): Float = java.lang.Float.parseFloat(s)
}