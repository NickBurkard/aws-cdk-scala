package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CFNDataSourceConfigurationsProperty {

  def apply(
    s3Logs: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty] = None
  ): software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty =
    (new software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.Builder)
      .s3Logs(s3Logs.orNull)
      .build()
}
