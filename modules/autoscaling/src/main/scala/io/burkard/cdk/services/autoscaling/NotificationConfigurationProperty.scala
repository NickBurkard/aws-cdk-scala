package io.burkard.cdk.services.autoscaling

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationConfigurationProperty {

  def apply(
    topicArn: String,
    notificationTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty =
    (new software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup.NotificationConfigurationProperty.Builder)
      .topicArn(topicArn)
      .notificationTypes(notificationTypes.map(_.asJava).orNull)
      .build()
}
