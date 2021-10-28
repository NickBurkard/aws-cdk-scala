package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrackingConfigProperty {

  def apply(
    autotrack: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.Builder)
      .autotrack(autotrack.orNull)
      .build()
}
