package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFargateProfile {

  def apply(
    internalResourceId: String,
    selectors: List[_],
    clusterName: String,
    podExecutionRoleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    fargateProfileName: Option[String] = None,
    subnets: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.eks.CfnFargateProfile =
    software.amazon.awscdk.services.eks.CfnFargateProfile.Builder
      .create(stackCtx, internalResourceId)
      .selectors(selectors.asJava)
      .clusterName(clusterName)
      .podExecutionRoleArn(podExecutionRoleArn)
      .tags(tags.map(_.asJava).orNull)
      .fargateProfileName(fargateProfileName.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}
