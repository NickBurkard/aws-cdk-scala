package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationChannel {

  def apply(
    internalResourceId: String,
    config: software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel =
    software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.Builder
      .create(stackCtx, internalResourceId)
      .config(config)
      .build()
}
