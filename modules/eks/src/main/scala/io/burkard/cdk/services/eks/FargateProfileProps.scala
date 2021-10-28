package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FargateProfileProps {

  def apply(
    fargateProfileName: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.eks.Cluster] = None,
    selectors: Option[List[_ <: software.amazon.awscdk.services.eks.Selector]] = None,
    podExecutionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.eks.FargateProfileProps =
    (new software.amazon.awscdk.services.eks.FargateProfileProps.Builder)
      .fargateProfileName(fargateProfileName.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .podExecutionRole(podExecutionRole.orNull)
      .vpc(vpc.orNull)
      .build()
}