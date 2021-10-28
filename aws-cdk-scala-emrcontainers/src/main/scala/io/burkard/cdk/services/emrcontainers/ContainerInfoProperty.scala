package io.burkard.cdk.services.emrcontainers

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerInfoProperty {

  def apply(
    eksInfo: Option[software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.EksInfoProperty] = None
  ): software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty =
    (new software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster.ContainerInfoProperty.Builder)
      .eksInfo(eksInfo.orNull)
      .build()
}
