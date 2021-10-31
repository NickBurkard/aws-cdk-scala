package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceMarketOptionsProperty {

  def apply(
    spotOptions: Option[software.amazon.awscdk.services.ec2.CfnLaunchTemplate.SpotOptionsProperty] = None,
    marketType: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.InstanceMarketOptionsProperty.Builder)
      .spotOptions(spotOptions.orNull)
      .marketType(marketType.orNull)
      .build()
}
