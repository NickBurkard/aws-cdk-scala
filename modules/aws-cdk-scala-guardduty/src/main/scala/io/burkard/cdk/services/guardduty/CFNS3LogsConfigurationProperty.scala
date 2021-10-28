package io.burkard.cdk.services.guardduty

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CFNS3LogsConfigurationProperty {

  def apply(
    enable: Option[Boolean] = None
  ): software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
    (new software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.Builder)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
