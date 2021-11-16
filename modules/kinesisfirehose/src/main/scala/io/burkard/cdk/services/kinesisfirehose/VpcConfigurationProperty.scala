package io.burkard.cdk.services.kinesisfirehose

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfigurationProperty {

  def apply(
    subnetIds: List[String],
    securityGroupIds: List[String],
    roleArn: String
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty.Builder)
      .subnetIds(subnetIds.asJava)
      .securityGroupIds(securityGroupIds.asJava)
      .roleArn(roleArn)
      .build()
}
