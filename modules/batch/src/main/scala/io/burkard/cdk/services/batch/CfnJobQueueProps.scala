package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobQueueProps {

  def apply(
    priority: Number,
    computeEnvironmentOrder: List[_],
    jobQueueName: Option[String] = None,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    schedulingPolicyArn: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobQueueProps =
    (new software.amazon.awscdk.services.batch.CfnJobQueueProps.Builder)
      .priority(priority)
      .computeEnvironmentOrder(computeEnvironmentOrder.asJava)
      .jobQueueName(jobQueueName.orNull)
      .state(state.orNull)
      .tags(tags.orNull)
      .schedulingPolicyArn(schedulingPolicyArn.orNull)
      .build()
}
