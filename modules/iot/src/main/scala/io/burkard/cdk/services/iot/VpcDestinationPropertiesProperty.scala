package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcDestinationPropertiesProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    vpcId: Option[String] = None,
    roleArn: Option[String] = None,
    securityGroups: Option[List[String]] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .vpcId(vpcId.orNull)
      .roleArn(roleArn.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
