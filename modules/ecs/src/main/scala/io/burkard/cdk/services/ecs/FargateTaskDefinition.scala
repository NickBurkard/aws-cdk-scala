package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FargateTaskDefinition {

  def apply(
    internalResourceId: String,
    memoryLimitMiB: Option[Number] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    cpu: Option[Number] = None,
    ephemeralStorageGiB: Option[Number] = None,
    family: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.FargateTaskDefinition =
    software.amazon.awscdk.services.ecs.FargateTaskDefinition.Builder
      .create(stackCtx, internalResourceId)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .executionRole(executionRole.orNull)
      .proxyConfiguration(proxyConfiguration.orNull)
      .cpu(cpu.orNull)
      .ephemeralStorageGiB(ephemeralStorageGiB.orNull)
      .family(family.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .taskRole(taskRole.orNull)
      .build()
}
