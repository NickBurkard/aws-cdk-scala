package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnADMChannel {

  def apply(
    internalResourceId: String,
    clientId: String,
    clientSecret: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnADMChannel =
    software.amazon.awscdk.services.pinpoint.CfnADMChannel.Builder
      .create(stackCtx, internalResourceId)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
