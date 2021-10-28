package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    kubernetesNetworkConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty] = None,
    version: Option[String] = None,
    roleArn: Option[String] = None,
    resourcesVpcConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty] = None,
    encryptionConfig: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnCluster =
    software.amazon.awscdk.services.eks.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .kubernetesNetworkConfig(kubernetesNetworkConfig.orNull)
      .version(version.orNull)
      .roleArn(roleArn.orNull)
      .resourcesVpcConfig(resourcesVpcConfig.orNull)
      .encryptionConfig(encryptionConfig.map(_.asJava).orNull)
      .build()
}
