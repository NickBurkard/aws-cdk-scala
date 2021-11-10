package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessLogSettingsProperty {

  def apply(
    format: Option[String] = None,
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnStageV2.AccessLogSettingsProperty =
    (new software.amazon.awscdk.services.apigateway.CfnStageV2.AccessLogSettingsProperty.Builder)
      .format(format.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
