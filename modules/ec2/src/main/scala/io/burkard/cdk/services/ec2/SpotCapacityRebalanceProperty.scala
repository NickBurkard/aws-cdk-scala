package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SpotCapacityRebalanceProperty {

  def apply(
    terminationDelay: Option[Number] = None,
    replacementStrategy: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty =
    (new software.amazon.awscdk.services.ec2.CfnSpotFleet.SpotCapacityRebalanceProperty.Builder)
      .terminationDelay(terminationDelay.orNull)
      .replacementStrategy(replacementStrategy.orNull)
      .build()
}
