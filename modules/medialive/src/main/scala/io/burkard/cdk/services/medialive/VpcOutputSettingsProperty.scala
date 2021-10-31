package io.burkard.cdk.services.medialive

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcOutputSettingsProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    publicAddressAllocationIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VpcOutputSettingsProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .publicAddressAllocationIds(publicAddressAllocationIds.map(_.asJava).orNull)
      .build()
}
