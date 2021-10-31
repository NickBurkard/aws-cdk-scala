package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatisticalThresholdProperty {

  def apply(
    statistic: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty =
    (new software.amazon.awscdk.services.iot.CfnSecurityProfile.StatisticalThresholdProperty.Builder)
      .statistic(statistic.orNull)
      .build()
}
