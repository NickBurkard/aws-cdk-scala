package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FargateTaskDefinitionProps {

  def apply(
    memoryLimitMiB: Option[Number] = None,
    executionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxyConfiguration: Option[software.amazon.awscdk.services.ecs.ProxyConfiguration] = None,
    cpu: Option[Number] = None,
    ephemeralStorageGiB: Option[Number] = None,
    family: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.services.ecs.Volume]] = None,
    taskRole: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps =
    (new software.amazon.awscdk.services.ecs.FargateTaskDefinitionProps.Builder)
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
