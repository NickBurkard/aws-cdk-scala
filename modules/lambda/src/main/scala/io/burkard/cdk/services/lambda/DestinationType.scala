package io.burkard.cdk.services.lambda


sealed abstract class DestinationType(val underlying: software.amazon.awscdk.services.lambda.DestinationType)
  extends Product
    with Serializable


object DestinationType {
  implicit def toAws(value: DestinationType): software.amazon.awscdk.services.lambda.DestinationType =
    Option(value).map(_.underlying).orNull

  case object Failure
    extends DestinationType(software.amazon.awscdk.services.lambda.DestinationType.FAILURE)

  case object Success
    extends DestinationType(software.amazon.awscdk.services.lambda.DestinationType.SUCCESS)
}
