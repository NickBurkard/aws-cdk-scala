package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ExternalTaskDefinition {

  def apply(
    internalResourceId: String,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    family: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.ExternalTaskDefinition =
    software.amazon.awscdk.services.ecs.ExternalTaskDefinition.Builder
      .create(stackCtx, internalResourceId)
      .executionRole(executionRole.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .family(family.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .build()
}
