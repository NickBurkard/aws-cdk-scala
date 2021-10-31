package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBaiduChannelProps {

  def apply(
    apiKey: Option[String] = None,
    secretKey: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnBaiduChannelProps.Builder)
      .apiKey(apiKey.orNull)
      .secretKey(secretKey.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
