package io.burkard.cdk.services.sqs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnQueueProps {

  def apply(
    fifoThroughputLimit: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    messageRetentionPeriod: Option[Number] = None,
    visibilityTimeout: Option[Number] = None,
    deduplicationScope: Option[String] = None,
    fifoQueue: Option[Boolean] = None,
    kmsDataKeyReusePeriodSeconds: Option[Number] = None,
    queueName: Option[String] = None,
    kmsMasterKeyId: Option[String] = None,
    maximumMessageSize: Option[Number] = None,
    redriveAllowPolicy: Option[AnyRef] = None,
    receiveMessageWaitTimeSeconds: Option[Number] = None,
    contentBasedDeduplication: Option[Boolean] = None,
    redrivePolicy: Option[AnyRef] = None,
    delaySeconds: Option[Number] = None
  ): software.amazon.awscdk.services.sqs.CfnQueueProps =
    (new software.amazon.awscdk.services.sqs.CfnQueueProps.Builder)
      .fifoThroughputLimit(fifoThroughputLimit.orNull)
      .tags(tags.map(_.asJava).orNull)
      .messageRetentionPeriod(messageRetentionPeriod.orNull)
      .visibilityTimeout(visibilityTimeout.orNull)
      .deduplicationScope(deduplicationScope.orNull)
      .fifoQueue(fifoQueue.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds.orNull)
      .queueName(queueName.orNull)
      .kmsMasterKeyId(kmsMasterKeyId.orNull)
      .maximumMessageSize(maximumMessageSize.orNull)
      .redriveAllowPolicy(redriveAllowPolicy.orNull)
      .receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds.orNull)
      .contentBasedDeduplication(contentBasedDeduplication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .redrivePolicy(redrivePolicy.orNull)
      .delaySeconds(delaySeconds.orNull)
      .build()
}
