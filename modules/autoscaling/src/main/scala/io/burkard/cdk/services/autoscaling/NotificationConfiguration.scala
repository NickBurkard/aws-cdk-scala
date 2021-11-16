package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotificationConfiguration {

  def apply(
    topic: software.amazon.awscdk.services.sns.ITopic,
    scalingEvents: Option[software.amazon.awscdk.services.autoscaling.ScalingEvents] = None
  ): software.amazon.awscdk.services.autoscaling.NotificationConfiguration =
    (new software.amazon.awscdk.services.autoscaling.NotificationConfiguration.Builder)
      .topic(topic)
      .scalingEvents(scalingEvents.orNull)
      .build()
}
