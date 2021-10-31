package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSpotFleetProps {

  def apply(
    spotFleetRequestConfigData: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleetProps =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleetProps.Builder)
      .spotFleetRequestConfigData(spotFleetRequestConfigData.orNull)
      .build()
}
