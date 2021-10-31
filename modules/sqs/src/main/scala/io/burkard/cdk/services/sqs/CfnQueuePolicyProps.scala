package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnQueuePolicyProps {

  def apply(
    queues: Option[List[String]] = None,
    policyDocument: Option[AnyRef] = None
  ): software.amazon.awscdk.services.sqs.CfnQueuePolicyProps =
    (new software.amazon.awscdk.services.sqs.CfnQueuePolicyProps.Builder)
      .queues(queues.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
