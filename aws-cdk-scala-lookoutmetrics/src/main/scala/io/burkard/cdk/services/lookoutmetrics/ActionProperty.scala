package io.burkard.cdk.services.lookoutmetrics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionProperty {

  def apply(
    lambdaConfiguration: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAlert.LambdaConfigurationProperty] = None,
    snsConfiguration: Option[software.amazon.awscdk.services.lookoutmetrics.CfnAlert.SNSConfigurationProperty] = None
  ): software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty =
    (new software.amazon.awscdk.services.lookoutmetrics.CfnAlert.ActionProperty.Builder)
      .lambdaConfiguration(lambdaConfiguration.orNull)
      .snsConfiguration(snsConfiguration.orNull)
      .build()
}
