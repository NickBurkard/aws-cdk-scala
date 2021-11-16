package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDetector {

  def apply(
    internalResourceId: String,
    enable: Boolean,
    findingPublishingFrequency: Option[String] = None,
    dataSources: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.guardduty.CfnDetector =
    software.amazon.awscdk.services.guardduty.CfnDetector.Builder
      .create(stackCtx, internalResourceId)
      .enable(enable)
      .findingPublishingFrequency(findingPublishingFrequency.orNull)
      .dataSources(dataSources.orNull)
      .build()
}
