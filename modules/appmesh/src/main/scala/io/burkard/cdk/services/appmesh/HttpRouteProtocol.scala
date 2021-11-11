package io.burkard.cdk.services.appmesh

sealed abstract class HttpRouteProtocol(val underlying: software.amazon.awscdk.services.appmesh.HttpRouteProtocol)
  extends Product
    with Serializable

object HttpRouteProtocol {
  implicit def toAws(value: HttpRouteProtocol): software.amazon.awscdk.services.appmesh.HttpRouteProtocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends HttpRouteProtocol(software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTP)

  case object Https
    extends HttpRouteProtocol(software.amazon.awscdk.services.appmesh.HttpRouteProtocol.HTTPS)
}
