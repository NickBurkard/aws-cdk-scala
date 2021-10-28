package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueueConfigurationProperty {

  def apply(
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty] = None,
    event: Option[String] = None,
    queue: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder)
      .filter(filter.orNull)
      .event(event.orNull)
      .queue(queue.orNull)
      .build()
}
