package io.burkard.cdk.services.groundstation

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecurityDetailsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
