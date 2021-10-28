package io.burkard.cdk.services.sqs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
