package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimestreamActionProperty {

  def apply(
    tableName: String,
    roleArn: String,
    dimensions: List[_],
    databaseName: String,
    timestamp: Option[software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamTimestampProperty] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.TimestreamActionProperty.Builder)
      .tableName(tableName)
      .roleArn(roleArn)
      .dimensions(dimensions.asJava)
      .databaseName(databaseName)
      .timestamp(timestamp.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
