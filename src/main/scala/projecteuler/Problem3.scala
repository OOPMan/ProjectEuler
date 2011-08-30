package projecteuler

import collection.mutable.ArrayBuffer

/**
 * Created by IntelliJ IDEA.
 * User: adamj
 * Date: 8/7/11
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */

object Problem3 {
    // The Number
    val theNumber = 600851475143L

    // A Lazy Stream of Normal Numbers
    lazy val NormalStream: Stream[Long] = 1 #:: NormalStream.map { _ + 1 }

    lazy val PrimeSourceStream: Stream[Long] = 1 #:: 2 #:: 3 #:: PrimeSourceStream.map { _ + 2 }

    // Stream-based prime generator. From the Streams API doc
    // A Stream of Normal Numbers starting at n
    def from(n: Long): Stream[Long] = n #:: from(n+1)

    // A Stream of Prime Numbers starting from an input Stream of Normal Numbers
    def sieve(s: Stream[Long]): Stream[Long] = s.head #:: sieve(s.tail.filter { _ % s.head != 0 })

    // A Stream of Prime Numers starting from 2, the first prime
    lazy val primes = sieve(from(2))

    // Simple method described at http://www.scala-blogs.org/2007/12/project-euler-fun-in-scala.html
    def ScalaBlog(theNumber: Long) = {
        var theNum = theNumber
        NormalStream.drop(1).dropWhile(n => { while(theNum % n == 0) theNum /= n; theNum > 1}).head
    }

}