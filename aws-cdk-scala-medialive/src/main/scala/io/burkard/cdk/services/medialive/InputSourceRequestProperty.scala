package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputSourceRequestProperty {

  def apply(
    url: Option[String] = None,
    username: Option[String] = None,
    passwordParam: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty =
    (new software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty.Builder)
      .url(url.orNull)
      .username(username.orNull)
      .passwordParam(passwordParam.orNull)
      .build()
}
