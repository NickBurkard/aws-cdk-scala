package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventDestinationProperty {

  def apply(
    name: Option[String] = None,
    kinesisFirehoseDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty] = None,
    enabled: Option[Boolean] = None,
    cloudWatchDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty] = None,
    matchingEventTypes: Option[List[String]] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder)
      .name(name.orNull)
      .kinesisFirehoseDestination(kinesisFirehoseDestination.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchDestination(cloudWatchDestination.orNull)
      .matchingEventTypes(matchingEventTypes.map(_.asJava).orNull)
      .build()
}
