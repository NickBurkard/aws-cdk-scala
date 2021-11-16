package io.burkard.cdk.services.kinesis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStream {

  def apply(
    internalResourceId: String,
    shardCount: Number,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriodHours: Option[Number] = None,
    streamEncryption: Option[software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kinesis.CfnStream =
    software.amazon.awscdk.services.kinesis.CfnStream.Builder
      .create(stackCtx, internalResourceId)
      .shardCount(shardCount)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriodHours(retentionPeriodHours.orNull)
      .streamEncryption(streamEncryption.orNull)
      .build()
}
