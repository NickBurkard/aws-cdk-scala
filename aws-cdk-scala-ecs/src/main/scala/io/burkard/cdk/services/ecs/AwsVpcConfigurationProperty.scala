package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AwsVpcConfigurationProperty {

  def apply(
    subnets: Option[List[String]] = None,
    assignPublicIp: Option[String] = None,
    securityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.Builder)
      .subnets(subnets.map(_.asJava).orNull)
      .assignPublicIp(assignPublicIp.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
