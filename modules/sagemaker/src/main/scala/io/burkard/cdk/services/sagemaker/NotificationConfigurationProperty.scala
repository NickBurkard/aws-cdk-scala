package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationConfigurationProperty {

  def apply(
    notificationTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.Builder)
      .notificationTopicArn(notificationTopicArn.orNull)
      .build()
}
