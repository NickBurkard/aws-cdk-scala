package io.burkard.cdk.services.apigateway


sealed abstract class ApiKeySourceType(val underlying: software.amazon.awscdk.services.apigateway.ApiKeySourceType)
  extends Product
    with Serializable


object ApiKeySourceType {
  implicit def toAws(value: ApiKeySourceType): software.amazon.awscdk.services.apigateway.ApiKeySourceType =
    Option(value).map(_.underlying).orNull

  case object Header
    extends ApiKeySourceType(software.amazon.awscdk.services.apigateway.ApiKeySourceType.HEADER)

  case object Authorizer
    extends ApiKeySourceType(software.amazon.awscdk.services.apigateway.ApiKeySourceType.AUTHORIZER)
}
