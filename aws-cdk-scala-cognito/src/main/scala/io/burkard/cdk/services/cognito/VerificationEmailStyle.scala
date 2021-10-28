package io.burkard.cdk.services.cognito

sealed abstract class VerificationEmailStyle(val underlying: software.amazon.awscdk.services.cognito.VerificationEmailStyle)
  extends Product
    with Serializable

object VerificationEmailStyle {
  implicit def toAws(value: VerificationEmailStyle): software.amazon.awscdk.services.cognito.VerificationEmailStyle =
    Option(value).map(_.underlying).orNull

  case object Code
    extends VerificationEmailStyle(software.amazon.awscdk.services.cognito.VerificationEmailStyle.CODE)

  case object Link
    extends VerificationEmailStyle(software.amazon.awscdk.services.cognito.VerificationEmailStyle.LINK)
}
