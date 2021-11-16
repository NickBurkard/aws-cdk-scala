package io.burkard.cdk.services.emrcontainers

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerProviderProperty {

  def apply(
    info: software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty,
    id: String,
    `type`: String
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerProviderProperty.Builder)
      .info(info)
      .id(id)
      .`type`(`type`)
      .build()
}
