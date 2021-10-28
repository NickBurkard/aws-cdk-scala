package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NotificationConfigurationProperty {

  def apply(
    notificationTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.Builder)
      .notificationTopicArn(notificationTopicArn.orNull)
      .build()
}
