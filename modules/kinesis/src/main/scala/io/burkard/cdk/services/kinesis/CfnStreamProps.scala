package io.burkard.cdk.services.kinesis

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStreamProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    shardCount: Option[Number] = None,
    retentionPeriodHours: Option[Number] = None,
    streamEncryption: Option[software.amazon.awscdk.services.kinesis.CfnStream.StreamEncryptionProperty] = None
  ): software.amazon.awscdk.services.kinesis.CfnStreamProps =
    (new software.amazon.awscdk.services.kinesis.CfnStreamProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .shardCount(shardCount.orNull)
      .retentionPeriodHours(retentionPeriodHours.orNull)
      .streamEncryption(streamEncryption.orNull)
      .build()
}
