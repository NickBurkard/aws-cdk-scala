package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBaiduChannel {

  def apply(
    internalResourceId: String,
    apiKey: String,
    secretKey: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnBaiduChannel =
    software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder
      .create(stackCtx, internalResourceId)
      .apiKey(apiKey)
      .secretKey(secretKey)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
