package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobQueue {

  def apply(
    internalResourceId: String,
    priority: Number,
    computeEnvironmentOrder: List[_],
    jobQueueName: Option[String] = None,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    schedulingPolicyArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.batch.CfnJobQueue =
    software.amazon.awscdk.services.batch.CfnJobQueue.Builder
      .create(stackCtx, internalResourceId)
      .priority(priority)
      .computeEnvironmentOrder(computeEnvironmentOrder.asJava)
      .jobQueueName(jobQueueName.orNull)
      .state(state.orNull)
      .tags(tags.orNull)
      .schedulingPolicyArn(schedulingPolicyArn.orNull)
      .build()
}
