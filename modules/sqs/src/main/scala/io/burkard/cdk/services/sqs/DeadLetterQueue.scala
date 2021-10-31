package io.burkard.cdk.services.sqs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeadLetterQueue {

  def apply(
    queue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    maxReceiveCount: Option[Number] = None
  ): software.amazon.awscdk.services.sqs.DeadLetterQueue =
    (new software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder)
      .queue(queue.orNull)
      .maxReceiveCount(maxReceiveCount.orNull)
      .build()
}
