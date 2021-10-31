package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBaiduChannel {

  def apply(
    internalResourceId: String,
    apiKey: Option[String] = None,
    secretKey: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnBaiduChannel =
    software.amazon.awscdk.services.pinpoint.CfnBaiduChannel.Builder
      .create(stackCtx, internalResourceId)
      .apiKey(apiKey.orNull)
      .secretKey(secretKey.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
