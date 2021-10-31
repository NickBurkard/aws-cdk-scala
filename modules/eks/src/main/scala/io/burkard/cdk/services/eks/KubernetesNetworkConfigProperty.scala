package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KubernetesNetworkConfigProperty {

  def apply(
    serviceIpv4Cidr: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.Builder)
      .serviceIpv4Cidr(serviceIpv4Cidr.orNull)
      .build()
}
