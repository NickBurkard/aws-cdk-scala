package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationConfigurationProperty {

  def apply(
    lambdaConfigurations: Option[List[_]] = None,
    topicConfigurations: Option[List[_]] = None,
    queueConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.NotificationConfigurationProperty.Builder)
      .lambdaConfigurations(lambdaConfigurations.map(_.asJava).orNull)
      .topicConfigurations(topicConfigurations.map(_.asJava).orNull)
      .queueConfigurations(queueConfigurations.map(_.asJava).orNull)
      .build()
}
