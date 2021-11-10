package io.burkard.cdk.services.appmesh

@scala.annotation.nowarn("cat=deprecation")
sealed abstract class Protocol(val underlying: software.amazon.awscdk.services.appmesh.Protocol)
  extends Product
    with Serializable

@scala.annotation.nowarn("cat=deprecation")
object Protocol {
  implicit def toAws(value: Protocol): software.amazon.awscdk.services.appmesh.Protocol =
    Option(value).map(_.underlying).orNull

  case object Http
    extends Protocol(software.amazon.awscdk.services.appmesh.Protocol.HTTP)

  case object Tcp
    extends Protocol(software.amazon.awscdk.services.appmesh.Protocol.TCP)

  case object Http2
    extends Protocol(software.amazon.awscdk.services.appmesh.Protocol.HTTP2)

  case object Grpc
    extends Protocol(software.amazon.awscdk.services.appmesh.Protocol.GRPC)
}
