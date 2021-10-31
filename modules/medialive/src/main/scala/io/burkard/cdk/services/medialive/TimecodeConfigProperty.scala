package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TimecodeConfigProperty {

  def apply(
    source: Option[String] = None,
    syncThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.TimecodeConfigProperty.Builder)
      .source(source.orNull)
      .syncThreshold(syncThreshold.orNull)
      .build()
}
