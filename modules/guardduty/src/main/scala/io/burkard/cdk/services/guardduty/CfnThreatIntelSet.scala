package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnThreatIntelSet {

  def apply(
    internalResourceId: String,
    format: String,
    location: String,
    detectorId: String,
    activate: Boolean,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnThreatIntelSet =
    software.amazon.awscdk.services.guardduty.CfnThreatIntelSet.Builder
      .create(stackCtx, internalResourceId)
      .format(format)
      .location(location)
      .detectorId(detectorId)
      .activate(activate)
      .name(name.orNull)
      .build()
}
