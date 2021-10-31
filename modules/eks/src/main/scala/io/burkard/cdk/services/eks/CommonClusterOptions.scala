package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CommonClusterOptions {

  def apply(
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpcSubnets: Option[List[_ <: software.amazon.awscdk.services.ec2.SubnetSelection]] = None,
    version: Option[software.amazon.awscdk.services.eks.KubernetesVersion] = None,
    outputConfigCommand: Option[Boolean] = None,
    clusterName: Option[String] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    outputClusterName: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.eks.CommonClusterOptions =
    (new software.amazon.awscdk.services.eks.CommonClusterOptions.Builder)
      .role(role.orNull)
      .vpcSubnets(vpcSubnets.map(_.asJava).orNull)
      .version(version.orNull)
      .outputConfigCommand(outputConfigCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clusterName(clusterName.orNull)
      .securityGroup(securityGroup.orNull)
      .outputClusterName(outputClusterName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .build()
}
