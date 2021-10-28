package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnADMChannel {

  def apply(
    internalResourceId: String,
    clientId: Option[String] = None,
    clientSecret: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnADMChannel =
    software.amazon.awscdk.services.pinpoint.CfnADMChannel.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId.orNull)
      .clientSecret(clientSecret.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
