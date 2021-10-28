package io.burkard.cdk.services.pinpointemail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventDestinationProperty {

  def apply(
    pinpointDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.PinpointDestinationProperty] = None,
    kinesisFirehoseDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty] = None,
    enabled: Option[Boolean] = None,
    cloudWatchDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty] = None,
    matchingEventTypes: Option[List[String]] = None,
    snsDestination: Option[software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.SnsDestinationProperty] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder)
      .pinpointDestination(pinpointDestination.orNull)
      .kinesisFirehoseDestination(kinesisFirehoseDestination.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchDestination(cloudWatchDestination.orNull)
      .matchingEventTypes(matchingEventTypes.map(_.asJava).orNull)
      .snsDestination(snsDestination.orNull)
      .build()
}
