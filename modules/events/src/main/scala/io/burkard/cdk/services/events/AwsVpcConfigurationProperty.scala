package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsVpcConfigurationProperty {

  def apply(
    subnets: Option[List[String]] = None,
    assignPublicIp: Option[String] = None,
    securityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty =
    (new software.amazon.awscdk.services.events.CfnRule.AwsVpcConfigurationProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .assignPublicIp(assignPublicIp.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
