package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StaticKeySettingsProperty {

  def apply(
    keyProviderServer: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty] = None,
    staticKeyValue: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.StaticKeySettingsProperty.Builder)
      .keyProviderServer(keyProviderServer.orNull)
      .staticKeyValue(staticKeyValue.orNull)
      .build()
}
