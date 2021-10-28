package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTrafficRoutingTimeBasedCanary {

  def apply(
    bakeTimeMins: Option[Number] = None,
    stepPercentage: Option[Number] = None
  ): software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary =
    (new software.amazon.awscdk.CfnTrafficRoutingTimeBasedCanary.Builder)
      .bakeTimeMins(bakeTimeMins.orNull)
      .stepPercentage(stepPercentage.orNull)
      .build()
}
