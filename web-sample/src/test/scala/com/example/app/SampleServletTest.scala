package com.example.app

import org.scalatest.FunSuiteLike
import org.scalatra.test.scalatest._

/**
  * Created by vitojeng on 11/28/16.
  */
class SampleServletTest extends ScalatraSuite with FunSuiteLike {

  addServlet(classOf[SampleServlet], "/*")

  test("simple test") {
    get("/") {
      status should equal(200)
      body should include ("hi!")
    }
  }
}
