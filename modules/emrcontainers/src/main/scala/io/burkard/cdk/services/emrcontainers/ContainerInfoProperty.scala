package io.burkard.cdk.services.emrcontainers

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerInfoProperty {

  def apply(
    eksInfo: Option[software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty] = None
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.Builder)
      .eksInfo(eksInfo.orNull)
      .build()
}
