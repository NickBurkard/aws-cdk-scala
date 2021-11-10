package io.burkard.cdk.services.apigateway


sealed abstract class AuthorizationType(val underlying: software.amazon.awscdk.services.apigateway.AuthorizationType)
  extends Product
    with Serializable


object AuthorizationType {
  implicit def toAws(value: AuthorizationType): software.amazon.awscdk.services.apigateway.AuthorizationType =
    Option(value).map(_.underlying).orNull

  case object None
    extends AuthorizationType(software.amazon.awscdk.services.apigateway.AuthorizationType.NONE)

  case object Iam
    extends AuthorizationType(software.amazon.awscdk.services.apigateway.AuthorizationType.IAM)

  case object Custom
    extends AuthorizationType(software.amazon.awscdk.services.apigateway.AuthorizationType.CUSTOM)

  case object Cognito
    extends AuthorizationType(software.amazon.awscdk.services.apigateway.AuthorizationType.COGNITO)
}
