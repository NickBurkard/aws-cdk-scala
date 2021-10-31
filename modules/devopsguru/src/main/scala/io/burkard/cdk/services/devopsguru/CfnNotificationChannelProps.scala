package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationChannelProps {

  def apply(
    config: Option[software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty] = None
  ): software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps =
    (new software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.Builder)
      .config(config.orNull)
      .build()
}
