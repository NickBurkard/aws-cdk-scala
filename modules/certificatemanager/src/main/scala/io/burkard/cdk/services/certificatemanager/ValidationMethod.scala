package io.burkard.cdk.services.certificatemanager

sealed abstract class ValidationMethod(val underlying: software.amazon.awscdk.services.certificatemanager.ValidationMethod)
  extends Product
    with Serializable

object ValidationMethod {
  implicit def toAws(value: ValidationMethod): software.amazon.awscdk.services.certificatemanager.ValidationMethod =
    Option(value).map(_.underlying).orNull

  case object Dns
    extends ValidationMethod(software.amazon.awscdk.services.certificatemanager.ValidationMethod.DNS)

  case object Email
    extends ValidationMethod(software.amazon.awscdk.services.certificatemanager.ValidationMethod.EMAIL)
}
