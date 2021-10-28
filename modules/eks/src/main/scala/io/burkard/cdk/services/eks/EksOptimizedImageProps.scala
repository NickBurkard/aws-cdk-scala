package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EksOptimizedImageProps {

  def apply(
    cpuArch: Option[software.amazon.awscdk.services.eks.CpuArch] = None,
    nodeType: Option[software.amazon.awscdk.services.eks.NodeType] = None,
    kubernetesVersion: Option[String] = None
  ): software.amazon.awscdk.services.eks.EksOptimizedImageProps =
    (new software.amazon.awscdk.services.eks.EksOptimizedImageProps.Builder)
      .cpuArch(cpuArch.orNull)
      .nodeType(nodeType.orNull)
      .kubernetesVersion(kubernetesVersion.orNull)
      .build()
}