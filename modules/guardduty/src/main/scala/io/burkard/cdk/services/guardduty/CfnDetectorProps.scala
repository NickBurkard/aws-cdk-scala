package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDetectorProps {

  def apply(
    enable: Option[Boolean] = None,
    findingPublishingFrequency: Option[String] = None,
    dataSources: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty] = None
  ): software.amazon.awscdk.services.guardduty.CfnDetectorProps =
    (new software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .dataSources(dataSources.orNull)
      .build()
}
