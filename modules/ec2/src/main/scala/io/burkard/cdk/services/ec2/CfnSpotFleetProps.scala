package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSpotFleetProps {

  def apply(
    spotFleetRequestConfigData: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty
  ): software.amazon.awscdk.services.ec2.CfnSpotFleetProps =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleetProps.Builder)
      .spotFleetRequestConfigData(spotFleetRequestConfigData)
      .build()
}
