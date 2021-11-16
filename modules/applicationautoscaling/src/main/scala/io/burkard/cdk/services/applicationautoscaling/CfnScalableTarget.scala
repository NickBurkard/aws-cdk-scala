package io.burkard.cdk.services.applicationautoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScalableTarget {

  def apply(
    internalResourceId: String,
    maxCapacity: Number,
    serviceNamespace: String,
    minCapacity: Number,
    roleArn: String,
    scalableDimension: String,
    resourceId: String,
    scheduledActions: Option[List[_]] = None,
    suspendedState: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget =
    software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.Builder
      .create(stackCtx, internalResourceId)
      .maxCapacity(maxCapacity)
      .serviceNamespace(serviceNamespace)
      .minCapacity(minCapacity)
      .roleArn(roleArn)
      .scalableDimension(scalableDimension)
      .resourceId(resourceId)
      .scheduledActions(scheduledActions.map(_.asJava).orNull)
      .suspendedState(suspendedState.orNull)
      .build()
}
