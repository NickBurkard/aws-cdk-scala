package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SpotCapacityRebalanceProperty {

  def apply(
    replacementStrategy: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.Builder)
      .replacementStrategy(replacementStrategy.orNull)
      .build()
}
