package io.burkard.cdk.services.sqs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeadLetterQueue {

  def apply(
    queue: software.amazon.awscdk.services.sqs.IQueue,
    maxReceiveCount: Number
  ): software.amazon.awscdk.services.sqs.DeadLetterQueue =
    (new software.amazon.awscdk.services.sqs.DeadLetterQueue.Builder)
      .queue(queue)
      .maxReceiveCount(maxReceiveCount)
      .build()
}
