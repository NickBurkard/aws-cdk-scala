package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueuePolicyProps {

  def apply(
    queues: List[_ <: software.amazon.awscdk.services.sqs.IQueue]
  ): software.amazon.awscdk.services.sqs.QueuePolicyProps =
    (new software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder)
      .queues(queues.asJava)
      .build()
}
