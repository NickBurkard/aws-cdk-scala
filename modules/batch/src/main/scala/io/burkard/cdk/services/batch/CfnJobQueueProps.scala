package io.burkard.cdk.services.batch

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnJobQueueProps {

  def apply(
    jobQueueName: Option[String] = None,
    priority: Option[Number] = None,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeEnvironmentOrder: Option[List[_]] = None
  ): software.amazon.awscdk.services.batch.CfnJobQueueProps =
    (new software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder)
      .jobQueueName(jobQueueName.orNull)
      .priority(priority.orNull)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeEnvironmentOrder(computeEnvironmentOrder.map(_.asJava).orNull)
      .build()
}
