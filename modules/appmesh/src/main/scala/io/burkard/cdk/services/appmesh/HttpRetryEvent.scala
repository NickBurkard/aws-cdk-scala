package io.burkard.cdk.services.appmesh

sealed abstract class HttpRetryEvent(val underlying: software.amazon.awscdk.services.appmesh.HttpRetryEvent)
  extends Product
    with Serializable

object HttpRetryEvent {
  implicit def toAws(value: HttpRetryEvent): software.amazon.awscdk.services.appmesh.HttpRetryEvent =
    Option(value).map(_.underlying).orNull

  case object ClientError
    extends HttpRetryEvent(software.amazon.awscdk.services.appmesh.HttpRetryEvent.CLIENT_ERROR)

  case object GatewayError
    extends HttpRetryEvent(software.amazon.awscdk.services.appmesh.HttpRetryEvent.GATEWAY_ERROR)

  case object ServerError
    extends HttpRetryEvent(software.amazon.awscdk.services.appmesh.HttpRetryEvent.SERVER_ERROR)

  case object StreamError
    extends HttpRetryEvent(software.amazon.awscdk.services.appmesh.HttpRetryEvent.STREAM_ERROR)
}
