package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonEcsRunTaskProps {

  def apply(
    cluster: software.amazon.awscdk.services.ecs.ICluster,
    taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.Builder)
      .cluster(cluster)
      .taskDefinition(taskDefinition)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .integrationPattern(integrationPattern.orNull)
      .build()
}
