package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDetectorProps {

  def apply(
    enable: Boolean,
    findingPublishingFrequency: Option[String] = None,
    dataSources: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty] = None
  ): software.amazon.awscdk.services.guardduty.CfnDetectorProps =
    (new software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder)
      .enable(enable)
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .dataSources(dataSources.orNull)
      .build()
}
