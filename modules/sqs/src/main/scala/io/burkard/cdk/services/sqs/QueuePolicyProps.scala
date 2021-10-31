package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueuePolicyProps {

  def apply(
    queues: Option[List[_ <: software.amazon.awscdk.services.sqs.IQueue]] = None
  ): software.amazon.awscdk.services.sqs.QueuePolicyProps =
    (new software.amazon.awscdk.services.sqs.QueuePolicyProps.Builder)
      .queues(queues.map(_.asJava).orNull)
      .build()
}
