package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConfigProperty {

  def apply(
    subnets: Option[List[String]] = None,
    vpcId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.VpcConfigProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
