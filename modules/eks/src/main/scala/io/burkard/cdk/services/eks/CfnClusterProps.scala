package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    roleArn: String,
    resourcesVpcConfig: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty,
    name: Option[String] = None,
    logging: Option[software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kubernetesNetworkConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty] = None,
    version: Option[String] = None,
    encryptionConfig: Option[List[_]] = None
  ): software.amazon.awscdk.services.eks.CfnClusterProps =
    (new software.amazon.awscdk.services.eks.CfnClusterProps.Builder)
      .roleArn(roleArn)
      .resourcesVpcConfig(resourcesVpcConfig)
      .name(name.orNull)
      .logging(logging.orNull)
      .tags(tags.map(_.asJava).orNull)
      .kubernetesNetworkConfig(kubernetesNetworkConfig.orNull)
      .version(version.orNull)
      .encryptionConfig(encryptionConfig.map(_.asJava).orNull)
      .build()
}
