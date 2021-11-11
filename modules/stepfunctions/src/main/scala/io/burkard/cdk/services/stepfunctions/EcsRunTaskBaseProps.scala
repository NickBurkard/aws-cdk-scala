package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsRunTaskBaseProps {

  def apply(
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None,
    parameters: Option[Map[String, _]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskBaseProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EcsRunTaskBaseProps.Builder)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .integrationPattern(integrationPattern.orNull)
      .taskDefinition(taskDefinition.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .build()
}
