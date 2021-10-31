package io.burkard.cdk.services.sqs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueuePolicy {

  def apply(
    internalResourceId: String,
    queues: Option[List[_ <: software.amazon.awscdk.services.sqs.IQueue]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sqs.QueuePolicy =
    software.amazon.awscdk.services.sqs.QueuePolicy.Builder
      .create(stackCtx, internalResourceId)
      .queues(queues.map(_.asJava).orNull)
      .build()
}
