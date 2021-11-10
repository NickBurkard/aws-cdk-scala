package io.burkard.cdk.services.elasticloadbalancingv2


sealed abstract class ApplicationProtocolVersion(val underlying: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion)
  extends Product
    with Serializable


object ApplicationProtocolVersion {
  implicit def toAws(value: ApplicationProtocolVersion): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion =
    Option(value).map(_.underlying).orNull

  case object Grpc
    extends ApplicationProtocolVersion(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.GRPC)

  case object Http1
    extends ApplicationProtocolVersion(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP1)

  case object Http2
    extends ApplicationProtocolVersion(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion.HTTP2)
}
