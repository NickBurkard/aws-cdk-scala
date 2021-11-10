package io.burkard.cdk.services.lambda


sealed abstract class AuthenticationMethod(val underlying: software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod)
  extends Product
    with Serializable


object AuthenticationMethod {
  implicit def toAws(value: AuthenticationMethod): software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod =
    Option(value).map(_.underlying).orNull

  case object SaslScram512Auth
    extends AuthenticationMethod(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_512_AUTH)

  case object SaslScram256Auth
    extends AuthenticationMethod(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.SASL_SCRAM_256_AUTH)

  case object BasicAuth
    extends AuthenticationMethod(software.amazon.awscdk.services.lambda.eventsources.AuthenticationMethod.BASIC_AUTH)
}
