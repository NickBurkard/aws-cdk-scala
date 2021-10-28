package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClusterProps {

  def apply(
    name: Option[String] = None,
    kubernetesNetworkConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty] = None,
    version: Option[String] = None,
    roleArn: Option[String] = None,
    resourcesVpcConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty] = None,
    encryptionConfig: Option[List[_]] = None
  ): software.amazon.awscdk.services.eks.CfnClusterProps =
    (new software.amazon.awscdk.services.eks.CfnClusterProps.Builder)
      .name(name.orNull)
      .kubernetesNetworkConfig(kubernetesNetworkConfig.orNull)
      .version(version.orNull)
      .roleArn(roleArn.orNull)
      .resourcesVpcConfig(resourcesVpcConfig.orNull)
      .encryptionConfig(encryptionConfig.map(_.asJava).orNull)
      .build()
}
