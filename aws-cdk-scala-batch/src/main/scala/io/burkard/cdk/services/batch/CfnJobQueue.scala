package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJobQueue {

  def apply(
    internalResourceId: String,
    jobQueueName: Option[String] = None,
    priority: Option[Number] = None,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeEnvironmentOrder: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.batch.CfnJobQueue =
    software.amazon.awscdk.services.batch.CfnJobQueue.Builder
      .create(stackCtx, internalResourceId)
      .jobQueueName(jobQueueName.orNull)
      .priority(priority.orNull)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeEnvironmentOrder(computeEnvironmentOrder.map(_.asJava).orNull)
      .build()
}
