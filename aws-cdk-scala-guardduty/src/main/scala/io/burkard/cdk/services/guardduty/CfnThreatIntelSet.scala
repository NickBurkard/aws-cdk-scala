package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnThreatIntelSet {

  def apply(
    internalResourceId: String,
    format: Option[String] = None,
    name: Option[String] = None,
    location: Option[String] = None,
    detectorId: Option[String] = None,
    activate: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnThreatIntelSet =
    software.amazon.awscdk.services.guardduty.CfnThreatIntelSet.Builder
      .create(stackCtx, internalResourceId)
      .format(format.orNull)
      .name(name.orNull)
      .location(location.orNull)
      .detectorId(detectorId.orNull)
      .activate(activate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
