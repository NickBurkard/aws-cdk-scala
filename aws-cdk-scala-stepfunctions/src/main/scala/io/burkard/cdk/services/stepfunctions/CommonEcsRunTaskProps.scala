package io.burkard.cdk.services.stepfunctions

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CommonEcsRunTaskProps {

  def apply(
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.CommonEcsRunTaskProps.Builder)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .integrationPattern(integrationPattern.orNull)
      .taskDefinition(taskDefinition.orNull)
      .build()
}
