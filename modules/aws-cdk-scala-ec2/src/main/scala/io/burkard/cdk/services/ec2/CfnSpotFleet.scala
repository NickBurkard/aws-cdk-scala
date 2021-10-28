package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSpotFleet {

  def apply(
    internalResourceId: String,
    spotFleetRequestConfigData: Option[software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotFleetRequestConfigDataProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnSpotFleet =
    software.amazon.awscdk.services.ec2.CfnSpotFleet.Builder
      .create(stackCtx, internalResourceId)
      .spotFleetRequestConfigData(spotFleetRequestConfigData.orNull)
      .build()
}
