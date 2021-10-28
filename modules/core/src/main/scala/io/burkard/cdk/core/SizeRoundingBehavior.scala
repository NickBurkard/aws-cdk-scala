package io.burkard.cdk.core

sealed abstract class SizeRoundingBehavior(val underlying: software.amazon.awscdk.SizeRoundingBehavior)
  extends Product
    with Serializable

object SizeRoundingBehavior {
  implicit def toAws(value: SizeRoundingBehavior): software.amazon.awscdk.SizeRoundingBehavior =
    Option(value).map(_.underlying).orNull

  case object Fail
    extends SizeRoundingBehavior(software.amazon.awscdk.SizeRoundingBehavior.FAIL)

  case object Floor
    extends SizeRoundingBehavior(software.amazon.awscdk.SizeRoundingBehavior.FLOOR)

  case object None
    extends SizeRoundingBehavior(software.amazon.awscdk.SizeRoundingBehavior.NONE)
}
