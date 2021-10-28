package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDetector {

  def apply(
    internalResourceId: String,
    enable: Option[Boolean] = None,
    findingPublishingFrequency: Option[String] = None,
    dataSources: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnDetector =
    software.amazon.awscdk.services.guardduty.CfnDetector.Builder
      .create(stackCtx, internalResourceId)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .dataSources(dataSources.orNull)
      .build()
}
