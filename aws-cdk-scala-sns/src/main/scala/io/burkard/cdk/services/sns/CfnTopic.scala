package io.burkard.cdk.services.sns

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopic {

  def apply(
    internalResourceId: String,
    displayName: Option[String] = None,
    fifoTopic: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subscription: Option[List[_]] = None,
    topicName: Option[String] = None,
    contentBasedDeduplication: Option[Boolean] = None,
    kmsMasterKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sns.CfnTopic =
    software.amazon.awscdk.services.sns.CfnTopic.Builder
      .create(stackCtx, internalResourceId)
      .displayName(displayName.orNull)
      .fifoTopic(fifoTopic.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .subscription(subscription.map(_.asJava).orNull)
      .topicName(topicName.orNull)
      .contentBasedDeduplication(contentBasedDeduplication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .build()
}
