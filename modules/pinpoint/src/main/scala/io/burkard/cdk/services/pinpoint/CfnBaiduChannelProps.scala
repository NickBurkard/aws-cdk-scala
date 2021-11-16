package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBaiduChannelProps {

  def apply(
    apiKey: String,
    secretKey: String,
    applicationId: String,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.Builder)
      .apiKey(apiKey)
      .secretKey(secretKey)
      .applicationId(applicationId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
