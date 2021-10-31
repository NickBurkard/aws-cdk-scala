package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputLocationProperty {

  def apply(
    username: Option[String] = None,
    uri: Option[String] = None,
    passwordParam: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputLocationProperty.Builder)
      .username(username.orNull)
      .uri(uri.orNull)
      .passwordParam(passwordParam.orNull)
      .build()
}
