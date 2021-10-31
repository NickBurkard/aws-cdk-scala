package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TopicConfigurationProperty {

  def apply(
    event: Option[String] = None,
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty] = None,
    topic: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.TopicConfigurationProperty.Builder)
      .event(event.orNull)
      .filter(filter.orNull)
      .topic(topic.orNull)
      .build()
}
