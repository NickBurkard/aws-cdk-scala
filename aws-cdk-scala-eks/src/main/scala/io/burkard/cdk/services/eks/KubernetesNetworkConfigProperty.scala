package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KubernetesNetworkConfigProperty {

  def apply(
    serviceIpv4Cidr: Option[String] = None
  ): software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty =
    (new software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty.Builder)
      .serviceIpv4Cidr(serviceIpv4Cidr.orNull)
      .build()
}
