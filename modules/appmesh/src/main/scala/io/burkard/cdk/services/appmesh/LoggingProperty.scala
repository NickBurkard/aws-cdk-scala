package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoggingProperty {

  def apply(
    accessLog: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.AccessLogProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.LoggingProperty.Builder)
      .accessLog(accessLog.orNull)
      .build()
}
