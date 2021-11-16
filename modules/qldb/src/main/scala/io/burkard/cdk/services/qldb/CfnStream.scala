package io.burkard.cdk.services.qldb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStream {

  def apply(
    internalResourceId: String,
    inclusiveStartTime: String,
    ledgerName: String,
    roleArn: String,
    kinesisConfiguration: software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty,
    streamName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    exclusiveEndTime: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.qldb.CfnStream =
    software.amazon.awscdk.services.qldb.CfnStream.Builder
      .create(stackCtx, internalResourceId)
      .inclusiveStartTime(inclusiveStartTime)
      .ledgerName(ledgerName)
      .roleArn(roleArn)
      .kinesisConfiguration(kinesisConfiguration)
      .streamName(streamName)
      .tags(tags.map(_.asJava).orNull)
      .exclusiveEndTime(exclusiveEndTime.orNull)
      .build()
}
