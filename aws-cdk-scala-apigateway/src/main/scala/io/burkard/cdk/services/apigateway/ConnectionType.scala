package io.burkard.cdk.services.apigateway

sealed abstract class ConnectionType(val underlying: software.amazon.awscdk.services.apigateway.ConnectionType)
  extends Product
    with Serializable

object ConnectionType {
  implicit def toAws(value: ConnectionType): software.amazon.awscdk.services.apigateway.ConnectionType =
    Option(value).map(_.underlying).orNull

  case object Internet
    extends ConnectionType(software.amazon.awscdk.services.apigateway.ConnectionType.INTERNET)

  case object VpcLink
    extends ConnectionType(software.amazon.awscdk.services.apigateway.ConnectionType.VPC_LINK)
}
