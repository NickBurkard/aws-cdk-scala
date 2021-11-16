package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSpotFleet {

  def apply(
    internalResourceId: String,
    spotFleetRequestConfigData: software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSpotFleet =
    software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder
      .create(stackCtx, internalResourceId)
      .spotFleetRequestConfigData(spotFleetRequestConfigData)
      .build()
}
