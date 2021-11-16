package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueuePolicyProps {

  def apply(
    queues: List[String],
    policyDocument: AnyRef
  ): software.amazon.awscdk.services.sqs.CfnQueuePolicyProps =
    (new software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder)
      .queues(queues.asJava)
      .policyDocument(policyDocument)
      .build()
}
