package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationChannelProps {

  def apply(
    config: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
  ): software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps =
    (new software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.Builder)
      .config(config)
      .build()
}
