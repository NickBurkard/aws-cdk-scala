package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KafkaActionProperty {

  def apply(
    clientProperties: Map[String, String],
    destinationArn: String,
    topic: String,
    partition: Option[String] = None,
    key: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.Builder)
      .clientProperties(clientProperties.asJava)
      .destinationArn(destinationArn)
      .topic(topic)
      .partition(partition.orNull)
      .key(key.orNull)
      .build()
}
