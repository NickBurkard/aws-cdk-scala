package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KafkaActionProperty {

  def apply(
    partition: Option[String] = None,
    clientProperties: Option[Map[String, String]] = None,
    key: Option[String] = None,
    destinationArn: Option[String] = None,
    topic: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.KafkaActionProperty.Builder)
      .partition(partition.orNull)
      .clientProperties(clientProperties.map(_.asJava).orNull)
      .key(key.orNull)
      .destinationArn(destinationArn.orNull)
      .topic(topic.orNull)
      .build()
}
