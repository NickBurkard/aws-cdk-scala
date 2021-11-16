package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventDestinationProperty {

  def apply(
    matchingEventTypes: List[String],
    pinpointDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty] = None,
    kinesisFirehoseDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty] = None,
    enabled: Option[Boolean] = None,
    cloudWatchDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty] = None,
    snsDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder)
      .matchingEventTypes(matchingEventTypes.asJava)
      .pinpointDestination(pinpointDestination.orNull)
      .kinesisFirehoseDestination(kinesisFirehoseDestination.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchDestination(cloudWatchDestination.orNull)
      .snsDestination(snsDestination.orNull)
      .build()
}
