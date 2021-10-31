package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrackingConfigProperty {

  def apply(
    autotrack: Option[String] = None
  ): software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty =
    (new software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.Builder)
      .autotrack(autotrack.orNull)
      .build()
}
