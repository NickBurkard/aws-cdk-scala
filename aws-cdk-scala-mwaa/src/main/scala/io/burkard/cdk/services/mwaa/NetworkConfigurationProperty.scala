package io.burkard.cdk.services.mwaa

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkConfigurationProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty =
    (new software.amazon.awscdk.services.mwaa.CfnEnvironment.NetworkConfigurationProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .build()
}
