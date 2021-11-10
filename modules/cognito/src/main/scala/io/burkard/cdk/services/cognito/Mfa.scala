package io.burkard.cdk.services.cognito


sealed abstract class Mfa(val underlying: software.amazon.awscdk.services.cognito.Mfa)
  extends Product
    with Serializable


object Mfa {
  implicit def toAws(value: Mfa): software.amazon.awscdk.services.cognito.Mfa =
    Option(value).map(_.underlying).orNull

  case object Off
    extends Mfa(software.amazon.awscdk.services.cognito.Mfa.OFF)

  case object Optional
    extends Mfa(software.amazon.awscdk.services.cognito.Mfa.OPTIONAL)

  case object Required
    extends Mfa(software.amazon.awscdk.services.cognito.Mfa.REQUIRED)
}
