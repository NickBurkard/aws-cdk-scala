package io.burkard.cdk.services.emrcontainers

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerProviderProperty {

  def apply(
    info: Option[software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty] = None,
    id: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.Builder)
      .info(info.orNull)
      .id(id.orNull)
      .`type`(`type`.orNull)
      .build()
}
