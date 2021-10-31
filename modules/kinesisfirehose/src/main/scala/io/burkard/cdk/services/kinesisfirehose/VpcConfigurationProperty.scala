package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConfigurationProperty {

  def apply(
    subnetIds: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .build()
}
