package io.burkard.cdk.services.apigateway

sealed abstract class IntegrationType(val underlying: software.amazon.awscdk.services.apigateway.IntegrationType)
  extends Product
    with Serializable

object IntegrationType {
  implicit def toAws(value: IntegrationType): software.amazon.awscdk.services.apigateway.IntegrationType =
    Option(value).map(_.underlying).orNull

  case object Aws
    extends IntegrationType(software.amazon.awscdk.services.apigateway.IntegrationType.AWS)

  case object AwsProxy
    extends IntegrationType(software.amazon.awscdk.services.apigateway.IntegrationType.AWS_PROXY)

  case object Http
    extends IntegrationType(software.amazon.awscdk.services.apigateway.IntegrationType.HTTP)

  case object HttpProxy
    extends IntegrationType(software.amazon.awscdk.services.apigateway.IntegrationType.HTTP_PROXY)

  case object Mock
    extends IntegrationType(software.amazon.awscdk.services.apigateway.IntegrationType.MOCK)
}
