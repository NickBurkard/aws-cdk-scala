package io.burkard.cdk.services.dms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisSettingsProperty {

  def apply(
    serviceAccessRoleArn: Option[String] = None,
    messageFormat: Option[String] = None,
    streamArn: Option[String] = None
  ): software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty =
    (new software.amazon.awscdk.services.dms.CfnEndpoint.KinesisSettingsProperty.Builder)
      .serviceAccessRoleArn(serviceAccessRoleArn.orNull)
      .messageFormat(messageFormat.orNull)
      .streamArn(streamArn.orNull)
      .build()
}
