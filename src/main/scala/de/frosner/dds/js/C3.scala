package de.frosner.dds.js

import de.frosner.dds.util.StringResource

import scala.io.Source

object C3 {

  lazy val js = StringResource.read("/js/c3.min.js")
  lazy val css = StringResource.read("/css/c3.css")

}
