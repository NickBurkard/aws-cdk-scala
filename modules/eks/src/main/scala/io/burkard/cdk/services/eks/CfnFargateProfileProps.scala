package io.burkard.cdk.services.eks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFargateProfileProps {

  def apply(
    selectors: List[_],
    clusterName: String,
    podExecutionRoleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    fargateProfileName: Option[String] = None,
    subnets: Option[List[String]] = None
  ): software.amazon.awscdk.services.eks.CfnFargateProfileProps =
    (new software.amazon.awscdk.services.eks.CfnFargateProfileProps.Builder)
      .selectors(selectors.asJava)
      .clusterName(clusterName)
      .podExecutionRoleArn(podExecutionRoleArn)
      .tags(tags.map(_.asJava).orNull)
      .fargateProfileName(fargateProfileName.orNull)
      .subnets(subnets.map(_.asJava).orNull)
      .build()
}
