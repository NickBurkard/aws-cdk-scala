package io.burkard.cdk.core

sealed abstract class IgnoreMode(val underlying: software.amazon.awscdk.IgnoreMode)
  extends Product
    with Serializable

object IgnoreMode {
  implicit def toAws(value: IgnoreMode): software.amazon.awscdk.IgnoreMode =
    Option(value).map(_.underlying).orNull

  case object Docker
    extends IgnoreMode(software.amazon.awscdk.IgnoreMode.DOCKER)

  case object Git
    extends IgnoreMode(software.amazon.awscdk.IgnoreMode.GIT)

  case object Glob
    extends IgnoreMode(software.amazon.awscdk.IgnoreMode.GLOB)
}
