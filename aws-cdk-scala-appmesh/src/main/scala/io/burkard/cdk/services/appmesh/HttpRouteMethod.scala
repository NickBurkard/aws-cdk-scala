package io.burkard.cdk.services.appmesh

sealed abstract class HttpRouteMethod(val underlying: software.amazon.awscdk.services.appmesh.HttpRouteMethod)
  extends Product
    with Serializable

object HttpRouteMethod {
  implicit def toAws(value: HttpRouteMethod): software.amazon.awscdk.services.appmesh.HttpRouteMethod =
    Option(value).map(_.underlying).orNull

  case object Get
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.GET)

  case object Head
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.HEAD)

  case object Post
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.POST)

  case object Put
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.PUT)

  case object Delete
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.DELETE)

  case object Connect
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.CONNECT)

  case object Options
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.OPTIONS)

  case object Trace
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.TRACE)

  case object Patch
    extends HttpRouteMethod(software.amazon.awscdk.services.appmesh.HttpRouteMethod.PATCH)
}
