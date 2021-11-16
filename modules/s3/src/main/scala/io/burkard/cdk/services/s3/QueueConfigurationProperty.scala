package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueueConfigurationProperty {

  def apply(
    event: String,
    queue: String,
    filter: Option[software.amazon.awscdk.services.s3.CfnBucket.NotificationFilterProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.QueueConfigurationProperty.Builder)
      .event(event)
      .queue(queue)
      .filter(filter.orNull)
      .build()
}
