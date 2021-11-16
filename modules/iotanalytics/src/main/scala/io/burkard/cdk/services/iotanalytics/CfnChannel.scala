package io.burkard.cdk.services.iotanalytics

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnChannel {

  def apply(
    internalResourceId: String,
    channelName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriod: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty] = None,
    channelStorage: Option[software.amazon.awscdk.services.iotanalytics.CfnChannel.ChannelStorageProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotanalytics.CfnChannel =
    software.amazon.awscdk.services.iotanalytics.CfnChannel.Builder
      .create(stackCtx, internalResourceId)
      .channelName(channelName)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .channelStorage(channelStorage.orNull)
      .build()
}
