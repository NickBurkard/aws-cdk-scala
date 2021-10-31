package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FargateProfile {

  def apply(
    internalResourceId: String,
    fargateProfileName: Option[String] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.eks.Cluster] = None,
    selectors: Option[List[_ <: software.amazon.awscdk.services.eks.Selector]] = None,
    podExecutionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.FargateProfile =
    software.amazon.awscdk.services.eks.FargateProfile.Builder
      .create(stackCtx, internalResourceId)
      .fargateProfileName(fargateProfileName.orNull)
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .podExecutionRole(podExecutionRole.orNull)
      .vpc(vpc.orNull)
      .build()
}
