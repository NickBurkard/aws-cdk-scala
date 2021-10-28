package io.burkard.cdk.services.mediapackage

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnChannel {

  def apply(
    internalResourceId: String,
    egressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    id: Option[String] = None,
    ingressAccessLogs: Option[software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.mediapackage.CfnChannel =
    software.amazon.awscdk.services.mediapackage.CfnChannel.Builder
      .create(stackCtx, internalResourceId)
      .egressAccessLogs(egressAccessLogs.orNull)
      .id(id.orNull)
      .ingressAccessLogs(ingressAccessLogs.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
