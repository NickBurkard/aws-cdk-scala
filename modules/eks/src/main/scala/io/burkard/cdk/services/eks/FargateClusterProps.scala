package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FargateClusterProps {

  def apply(
    clusterHandlerSecurityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    outputMastersRoleArn: Option[Boolean] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    mastersRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    endpointAccess: Option[software.amazon.awscdk.services.eks.EndpointAccess] = None,
    serviceIpv4Cidr: Option[String] = None,
    placeClusterHandlerInVpc: Option[Boolean] = None,
    version: Option[software.amazon.awscdk.services.eks.KubernetesVersion] = None,
    albController: Option[software.amazon.awscdk.services.eks.AlbControllerOptions] = None,
    prune: Option[Boolean] = None,
    defaultProfile: Option[software.amazon.awscdk.services.eks.FargateProfileOptions] = None,
    kubectlEnvironment: Option[Map[String, String]] = None,
    outputConfigCommand: Option[Boolean] = None,
    clusterName: Option[String] = None,
    kubectlLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    clusterHandlerEnvironment: Option[Map[String, String]] = None,
    kubectlMemory: Option[software.amazon.awscdk.Size] = None,
    vpcSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    outputClusterName: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    onEventLayer: Option[software.amazon.awscdk.services.lambda.ILayerVersion] = None,
    coreDnsComputeType: Option[software.amazon.awscdk.services.eks.CoreDnsComputeType] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    secretsEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.eks.FargateClusterProps =
    (new software.amazon.awscdk.services.eks.FargateClusterProps.Builder)
      .clusterHandlerSecurityGroup(clusterHandlerSecurityGroup.orNull)
      .outputMastersRoleArn(outputMastersRoleArn.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .role(role.orNull)
      .mastersRole(mastersRole.orNull)
      .endpointAccess(endpointAccess.orNull)
      .serviceIpv4Cidr(serviceIpv4Cidr.orNull)
      .placeClusterHandlerInVpc(placeClusterHandlerInVpc.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .albController(albController.orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultProfile(defaultProfile.orNull)
      .kubectlEnvironment(kubectlEnvironment.map(_.asJava).orNull)
      .outputConfigCommand(outputConfigCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clusterName(clusterName.orNull)
      .kubectlLayer(kubectlLayer.orNull)
      .clusterHandlerEnvironment(clusterHandlerEnvironment.map(_.asJava).orNull)
      .kubectlMemory(kubectlMemory.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .outputClusterName(outputClusterName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .onEventLayer(onEventLayer.orNull)
      .coreDnsComputeType(coreDnsComputeType.orNull)
      .securityGroup(securityGroup.orNull)
      .secretsEncryptionKey(secretsEncryptionKey.orNull)
      .build()
}
