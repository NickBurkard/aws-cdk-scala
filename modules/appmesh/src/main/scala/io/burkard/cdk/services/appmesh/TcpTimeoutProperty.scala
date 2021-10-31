package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TcpTimeoutProperty {

  def apply(
    idle: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.DurationProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.TcpTimeoutProperty.Builder)
      .idle(idle.orNull)
      .build()
}
