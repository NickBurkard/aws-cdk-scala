package io.burkard.cdk.services.sqs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Queue {

  def apply(
    internalResourceId: String,
    fifoThroughputLimit: Option[software.amazon.awscdk.services.sqs.FifoThroughputLimit] = None,
    visibilityTimeout: Option[software.amazon.awscdk.Duration] = None,
    maxMessageSizeBytes: Option[Number] = None,
    deliveryDelay: Option[software.amazon.awscdk.Duration] = None,
    encryption: Option[software.amazon.awscdk.services.sqs.QueueEncryption] = None,
    queueName: Option[String] = None,
    fifo: Option[Boolean] = None,
    retentionPeriod: Option[software.amazon.awscdk.Duration] = None,
    deadLetterQueue: Option[software.amazon.awscdk.services.sqs.DeadLetterQueue] = None,
    deduplicationScope: Option[software.amazon.awscdk.services.sqs.DeduplicationScope] = None,
    encryptionMasterKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    receiveMessageWaitTime: Option[software.amazon.awscdk.Duration] = None,
    contentBasedDeduplication: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    dataKeyReuse: Option[software.amazon.awscdk.Duration] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sqs.Queue =
    software.amazon.awscdk.services.sqs.Queue.Builder
      .create(stackCtx, internalResourceId)
      .fifoThroughputLimit(fifoThroughputLimit.orNull)
      .visibilityTimeout(visibilityTimeout.orNull)
      .maxMessageSizeBytes(maxMessageSizeBytes.orNull)
      .deliveryDelay(deliveryDelay.orNull)
      .encryption(encryption.orNull)
      .queueName(queueName.orNull)
      .fifo(fifo.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .retentionPeriod(retentionPeriod.orNull)
      .deadLetterQueue(deadLetterQueue.orNull)
      .deduplicationScope(deduplicationScope.orNull)
      .encryptionMasterKey(encryptionMasterKey.orNull)
      .receiveMessageWaitTime(receiveMessageWaitTime.orNull)
      .contentBasedDeduplication(contentBasedDeduplication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .dataKeyReuse(dataKeyReuse.orNull)
      .build()
}
