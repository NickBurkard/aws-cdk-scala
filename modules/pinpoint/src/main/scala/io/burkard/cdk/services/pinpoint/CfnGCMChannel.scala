package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGCMChannel {

  def apply(
    internalResourceId: String,
    apiKey: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnGCMChannel =
    software.amazon.awscdk.services.pinpoint.CfnGCMChannel.Builder
      .create(stackCtx, internalResourceId)
      .apiKey(apiKey)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
