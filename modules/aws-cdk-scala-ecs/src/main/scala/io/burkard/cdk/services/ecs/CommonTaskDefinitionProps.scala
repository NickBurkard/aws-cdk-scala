package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CommonTaskDefinitionProps {

  def apply(
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    family: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.CommonTaskDefinitionProps.Builder)
      .executionRole(executionRole.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .family(family.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .build()
}
