package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIPSetProps {

  def apply(
    format: Option[String] = None,
    name: Option[String] = None,
    location: Option[String] = None,
    detectorId: Option[String] = None,
    activate: Option[Boolean] = None
  ): software.amazon.awscdk.services.guardduty.CfnIPSetProps =
    (new software.amazon.awscdk.services.guardduty.CfnIPSetProps.Builder)
      .format(format.orNull)
      .name(name.orNull)
      .location(location.orNull)
      .detectorId(detectorId.orNull)
      .activate(activate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
