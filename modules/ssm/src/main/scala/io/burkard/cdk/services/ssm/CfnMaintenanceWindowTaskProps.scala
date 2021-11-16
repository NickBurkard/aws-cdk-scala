package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMaintenanceWindowTaskProps {

  def apply(
    taskArn: String,
    taskType: String,
    priority: Number,
    windowId: String,
    maxConcurrency: Option[String] = None,
    taskInvocationParameters: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.TaskInvocationParametersProperty] = None,
    description: Option[String] = None,
    serviceRoleArn: Option[String] = None,
    cutoffBehavior: Option[String] = None,
    maxErrors: Option[String] = None,
    taskParameters: Option[AnyRef] = None,
    loggingInfo: Option[software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask.LoggingInfoProperty] = None,
    name: Option[String] = None,
    targets: Option[List[_]] = None
  ): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps =
    (new software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTaskProps.Builder)
      .taskArn(taskArn)
      .taskType(taskType)
      .priority(priority)
      .windowId(windowId)
      .maxConcurrency(maxConcurrency.orNull)
      .taskInvocationParameters(taskInvocationParameters.orNull)
      .description(description.orNull)
      .serviceRoleArn(serviceRoleArn.orNull)
      .cutoffBehavior(cutoffBehavior.orNull)
      .maxErrors(maxErrors.orNull)
      .taskParameters(taskParameters.orNull)
      .loggingInfo(loggingInfo.orNull)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .build()
}
