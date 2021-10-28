package io.burkard.cdk.services.appmesh

sealed abstract class TcpRetryEvent(val underlying: software.amazon.awscdk.services.appmesh.TcpRetryEvent)
  extends Product
    with Serializable

object TcpRetryEvent {
  implicit def toAws(value: TcpRetryEvent): software.amazon.awscdk.services.appmesh.TcpRetryEvent =
    Option(value).map(_.underlying).orNull

  case object ConnectionError
    extends TcpRetryEvent(software.amazon.awscdk.services.appmesh.TcpRetryEvent.CONNECTION_ERROR)
}
