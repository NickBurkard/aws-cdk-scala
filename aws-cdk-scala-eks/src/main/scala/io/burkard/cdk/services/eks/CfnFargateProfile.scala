package io.burkard.cdk.services.eks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFargateProfile {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    fargateProfileName: Option[String] = None,
    selectors: Option[List[_]] = None,
    clusterName: Option[String] = None,
    podExecutionRoleArn: Option[String] = None,
    subnets: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnFargateProfile =
    software.amazon.awscdk.services.eks.CfnFargateProfile.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .fargateProfileName(fargateProfileName.orNull)
      .selectors(selectors.map(_.asJava).orNull)
      .clusterName(clusterName.orNull)
      .podExecutionRoleArn(podExecutionRoleArn.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}
