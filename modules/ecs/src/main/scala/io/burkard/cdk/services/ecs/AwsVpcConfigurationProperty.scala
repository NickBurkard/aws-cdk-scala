package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsVpcConfigurationProperty {

  def apply(
    subnets: Option[List[String]] = None,
    assignPublicIp: Option[String] = None,
    securityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.AwsVpcConfigurationProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .assignPublicIp(assignPublicIp.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
