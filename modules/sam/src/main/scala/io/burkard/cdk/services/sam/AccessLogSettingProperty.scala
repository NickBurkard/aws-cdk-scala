package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessLogSettingProperty {

  def apply(
    format: Option[String] = None,
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty =
    (new software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty.Builder)
      .format(format.orNull)
      .destinationArn(destinationArn.orNull)
      .build()
}
