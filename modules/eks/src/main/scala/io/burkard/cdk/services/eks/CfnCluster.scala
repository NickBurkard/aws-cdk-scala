package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    roleArn: String,
    resourcesVpcConfig: software.amazon.awscdk.services.eks.CfnCluster.ResourcesVpcConfigProperty,
    name: Option[String] = None,
    logging: Option[software.amazon.awscdk.services.eks.CfnCluster.LoggingProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    kubernetesNetworkConfig: Option[software.amazon.awscdk.services.eks.CfnCluster.KubernetesNetworkConfigProperty] = None,
    version: Option[String] = None,
    encryptionConfig: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnCluster =
    software.amazon.awscdk.services.eks.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
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
