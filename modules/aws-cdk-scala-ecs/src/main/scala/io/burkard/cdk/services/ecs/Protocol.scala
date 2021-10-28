package io.burkard.cdk.services.ecs

sealed abstract class Protocol(val underlying: software.amazon.awscdk.services.ecs.Protocol)
  extends Product
    with Serializable

object Protocol {
  implicit def toAws(value: Protocol): software.amazon.awscdk.services.ecs.Protocol =
    Option(value).map(_.underlying).orNull

  case object Tcp
    extends Protocol(software.amazon.awscdk.services.ecs.Protocol.TCP)

  case object Udp
    extends Protocol(software.amazon.awscdk.services.ecs.Protocol.UDP)
}
