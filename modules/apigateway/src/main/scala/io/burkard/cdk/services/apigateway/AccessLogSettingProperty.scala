package io.burkard.cdk.services.apigateway

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLogSettingProperty {

  def apply(
    format: Option[String] = None,
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty =
    (new software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty.Builder)
      .format(format.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
