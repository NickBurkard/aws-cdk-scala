package io.burkard.cdk.services.batch

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnJobQueue {

  def apply(
    internalResourceId: String,
    jobQueueName: Option[String] = None,
    priority: Option[Number] = None,
    state: Option[String] = None,
    tags: Option[AnyRef] = None,
    computeEnvironmentOrder: Option[List[_]] = None,
    schedulingPolicyArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.batch.CfnJobQueue =
    software.amazon.awscdk.services.batch.CfnJobQueue.Builder
      .create(stackCtx, internalResourceId)
      .jobQueueName(jobQueueName.orNull)
      .priority(priority.orNull)
      .state(state.orNull)
      .tags(tags.orNull)
      .computeEnvironmentOrder(computeEnvironmentOrder.map(_.asJava).orNull)
      .schedulingPolicyArn(schedulingPolicyArn.orNull)
      .build()
}
