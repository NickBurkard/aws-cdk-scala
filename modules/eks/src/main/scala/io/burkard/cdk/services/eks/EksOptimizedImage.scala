package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EksOptimizedImage {

  def apply(
    cpuArch: Option[software.amazon.awscdk.services.eks.CpuArch] = None,
    nodeType: Option[software.amazon.awscdk.services.eks.NodeType] = None,
    kubernetesVersion: Option[String] = None
  ): software.amazon.awscdk.services.eks.EksOptimizedImage =
    software.amazon.awscdk.services.eks.EksOptimizedImage.Builder
      .create()
      .cpuArch(cpuArch.orNull)
      .nodeType(nodeType.orNull)
      .kubernetesVersion(kubernetesVersion.orNull)
      .build()
}
