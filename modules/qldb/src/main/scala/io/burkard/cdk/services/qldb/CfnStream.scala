package io.burkard.cdk.services.qldb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStream {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    inclusiveStartTime: Option[String] = None,
    ledgerName: Option[String] = None,
    roleArn: Option[String] = None,
    exclusiveEndTime: Option[String] = None,
    kinesisConfiguration: Option[software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty] = None,
    streamName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.qldb.CfnStream =
    software.amazon.awscdk.services.qldb.CfnStream.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .inclusiveStartTime(inclusiveStartTime.orNull)
      .ledgerName(ledgerName.orNull)
      .roleArn(roleArn.orNull)
      .exclusiveEndTime(exclusiveEndTime.orNull)
      .kinesisConfiguration(kinesisConfiguration.orNull)
      .streamName(streamName.orNull)
      .build()
}
