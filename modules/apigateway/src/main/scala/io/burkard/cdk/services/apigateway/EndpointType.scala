package io.burkard.cdk.services.apigateway

sealed abstract class EndpointType(val underlying: software.amazon.awscdk.services.apigateway.EndpointType)
  extends Product
    with Serializable

object EndpointType {
  implicit def toAws(value: EndpointType): software.amazon.awscdk.services.apigateway.EndpointType =
    Option(value).map(_.underlying).orNull

  case object Edge
    extends EndpointType(software.amazon.awscdk.services.apigateway.EndpointType.EDGE)

  case object Private
    extends EndpointType(software.amazon.awscdk.services.apigateway.EndpointType.PRIVATE)

  case object Regional
    extends EndpointType(software.amazon.awscdk.services.apigateway.EndpointType.REGIONAL)
}
