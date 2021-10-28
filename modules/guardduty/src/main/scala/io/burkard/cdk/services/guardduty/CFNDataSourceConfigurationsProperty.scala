package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CFNDataSourceConfigurationsProperty {

  def apply(
    s3Logs: Option[software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty] = None
  ): software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty =
    (new software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.Builder)
      .s3Logs(s3Logs.orNull)
      .build()
}
