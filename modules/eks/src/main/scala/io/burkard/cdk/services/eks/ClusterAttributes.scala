package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterAttributes {

  def apply(
    clusterName: String,
    kubectlLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    kubectlRoleArn: Option[String] = None,
    openIdConnectProvider: Option[software.amazon.awscdk.services.iam.IOpenIdConnectProvider] = None,
    securityGroupIds: Option[List[String]] = None,
    clusterEncryptionConfigKeyArn: Option[String] = None,
    clusterCertificateAuthorityData: Option[String] = None,
    kubectlEnvironment: Option[Map[String, String]] = None,
    clusterSecurityGroupId: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    clusterHandlerSecurityGroupId: Option[String] = None,
    kubectlPrivateSubnetIds: Option[List[String]] = None,
    kubectlMemory: Option[software.amazon.awscdk.Size] = None,
    clusterEndpoint: Option[String] = None,
    prune: Option[Boolean] = None,
    onEventLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    kubectlSecurityGroupId: Option[String] = None
  ): software.amazon.awscdk.services.eks.ClusterAttributes =
    (new software.amazon.awscdk.services.eks.ClusterAttributes.Builder)
      .clusterName(clusterName)
      .kubectlLayer(kubectlLayer.orNull)
      .kubectlRoleArn(kubectlRoleArn.orNull)
      .openIdConnectProvider(openIdConnectProvider.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .clusterEncryptionConfigKeyArn(clusterEncryptionConfigKeyArn.orNull)
      .clusterCertificateAuthorityData(clusterCertificateAuthorityData.orNull)
      .kubectlEnvironment(kubectlEnvironment.map(_.asJava).orNull)
      .clusterSecurityGroupId(clusterSecurityGroupId.orNull)
      .vpc(vpc.orNull)
      .clusterHandlerSecurityGroupId(clusterHandlerSecurityGroupId.orNull)
      .kubectlPrivateSubnetIds(kubectlPrivateSubnetIds.map(_.asJava).orNull)
      .kubectlMemory(kubectlMemory.orNull)
      .clusterEndpoint(clusterEndpoint.orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .onEventLayer(onEventLayer.orNull)
      .kubectlSecurityGroupId(kubectlSecurityGroupId.orNull)
      .build()
}
