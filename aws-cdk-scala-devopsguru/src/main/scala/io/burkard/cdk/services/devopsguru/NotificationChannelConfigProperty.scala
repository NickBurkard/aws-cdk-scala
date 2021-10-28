package io.burkard.cdk.services.devopsguru

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationChannelConfigProperty {

  def apply(
    sns: Option[software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.SnsChannelConfigProperty] = None
  ): software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty =
    (new software.amazon.awscdk.services.devopsguru.CfnNotificationChannel.NotificationChannelConfigProperty.Builder)
      .sns(sns.orNull)
      .build()
}
