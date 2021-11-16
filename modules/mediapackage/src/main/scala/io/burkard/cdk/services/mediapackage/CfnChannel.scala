package io.burkard.cdk.services.mediapackage

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnChannel {

  def apply(
    internalResourceId: String,
    id: String,
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    ingressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnChannel =
    software.amazon.awscdk.services.mediapackage.CfnChannel.Builder
      .create(stackCtx, internalResourceId)
      .id(id)
      .egressAccessLogs(egressAccessLogs.orNull)
      .ingressAccessLogs(ingressAccessLogs.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
