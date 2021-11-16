package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AwsVpcConfigurationProperty {

  def apply(
    subnets: List[String],
    assignPublicIp: Option[String] = None,
    securityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty =
    (new software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.Builder)
      .subnets(subnets.asJava)
      .assignPublicIp(assignPublicIp.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
