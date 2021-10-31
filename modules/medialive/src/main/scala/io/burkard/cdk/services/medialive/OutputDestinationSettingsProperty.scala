package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputDestinationSettingsProperty {

  def apply(
    url: Option[String] = None,
    username: Option[String] = None,
    passwordParam: Option[String] = None,
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.OutputDestinationSettingsProperty.Builder)
      .url(url.orNull)
      .username(username.orNull)
      .passwordParam(passwordParam.orNull)
      .streamName(streamName.orNull)
      .build()
}
