package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnQueuePolicy {

  def apply(
    internalResourceId: String,
    queues: Option[List[String]] = None,
    policyDocument: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sqs.CfnQueuePolicy =
    software.amazon.awscdk.services.sqs.CfnQueuePolicy.Builder
      .create(stackCtx, internalResourceId)
      .queues(queues.map(_.asJava).orNull)
      .policyDocument(policyDocument.orNull)
      .build()
}
