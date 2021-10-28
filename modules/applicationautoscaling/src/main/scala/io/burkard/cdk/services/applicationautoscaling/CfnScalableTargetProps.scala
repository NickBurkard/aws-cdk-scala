package io.burkard.cdk.services.applicationautoscaling

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScalableTargetProps {

  def apply(
    maxCapacity: Option[Number] = None,
    scheduledActions: Option[List[_]] = None,
    serviceNamespace: Option[String] = None,
    minCapacity: Option[Number] = None,
    roleArn: Option[String] = None,
    suspendedState: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty] = None,
    scalableDimension: Option[String] = None,
    resourceId: Option[String] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder)
      .maxCapacity(maxCapacity.orNull)
      .scheduledActions(scheduledActions.map(_.asJava).orNull)
      .serviceNamespace(serviceNamespace.orNull)
      .minCapacity(minCapacity.orNull)
      .roleArn(roleArn.orNull)
      .suspendedState(suspendedState.orNull)
      .scalableDimension(scalableDimension.orNull)
      .resourceId(resourceId.orNull)
      .build()
}