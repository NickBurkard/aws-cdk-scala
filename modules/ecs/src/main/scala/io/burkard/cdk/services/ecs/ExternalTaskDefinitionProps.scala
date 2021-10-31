package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExternalTaskDefinitionProps {

  def apply(
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    family: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.ExternalTaskDefinitionProps.Builder)
      .executionRole(executionRole.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .family(family.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .build()
}
