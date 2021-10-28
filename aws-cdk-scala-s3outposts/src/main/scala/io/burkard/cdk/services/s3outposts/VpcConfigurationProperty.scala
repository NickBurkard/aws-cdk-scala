package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConfigurationProperty {

  def apply(
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty.Builder)
      .vpcId(vpcId.orNull)
      .build()
}
