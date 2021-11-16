package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnThreatIntelSetProps {

  def apply(
    format: String,
    location: String,
    detectorId: String,
    activate: Boolean,
    name: Option[String] = None
  ): software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps =
    (new software.amazon.awscdk.services.guardduty.CfnThreatIntelSetProps.Builder)
      .format(format)
      .location(location)
      .detectorId(detectorId)
      .activate(activate)
      .name(name.orNull)
      .build()
}
