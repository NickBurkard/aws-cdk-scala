package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConfigurationProperty {

  def apply(
    vpcId: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty.Builder)
      .vpcId(vpcId.orNull)
      .build()
}
