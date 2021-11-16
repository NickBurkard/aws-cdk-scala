package io.burkard.cdk.services.kinesis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStreamProps {

  def apply(
    shardCount: Number,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionPeriodHours: Option[Number] = None,
    streamEncryption: Option[software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty] = None
  ): software.amazon.awscdk.services.kinesis.CfnStreamProps =
    (new software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder)
      .shardCount(shardCount)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .retentionPeriodHours(retentionPeriodHours.orNull)
      .streamEncryption(streamEncryption.orNull)
      .build()
}
