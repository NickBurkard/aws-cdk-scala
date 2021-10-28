package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpTimeoutProperty {

  def apply(
    idle: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.Builder)
      .idle(idle.orNull)
      .build()
}
