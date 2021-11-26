package io.burkard.cdk.services.lambda

sealed abstract class StartingPosition(val underlying: software.amazon.awscdk.services.lambda.StartingPosition)
  extends Product
    with Serializable

object StartingPosition {
  implicit def toAws(value: StartingPosition): software.amazon.awscdk.services.lambda.StartingPosition =
    Option(value).map(_.underlying).orNull

  case object Latest
    extends StartingPosition(software.amazon.awscdk.services.lambda.StartingPosition.LATEST)

  case object TrimHorizon
    extends StartingPosition(software.amazon.awscdk.services.lambda.StartingPosition.TRIM_HORIZON)
}
