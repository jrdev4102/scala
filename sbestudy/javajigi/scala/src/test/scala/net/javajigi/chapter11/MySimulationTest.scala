package net.javajigi.chapter11

import net.javajigi.chapter11.MySimulation._

import org.scalatest.junit.AssertionsForJUnit
import org.junit.{Before, Test}

class MySimulationTest extends AssertionsForJUnit {

  @Test def runner() {
    val input1, input2, sum, carry = new Wire
    probe("sum", sum)
    probe("carry", carry)
    halfAdder(input1, input2, sum, carry)
    run()
    input1 setSignal true
    run()

    input2 setSignal true
    run()
  }
}