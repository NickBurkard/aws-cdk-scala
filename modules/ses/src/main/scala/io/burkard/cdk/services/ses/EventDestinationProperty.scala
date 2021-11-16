package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventDestinationProperty {

  def apply(
    matchingEventTypes: List[String],
    name: Option[String] = None,
    kinesisFirehoseDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.KinesisFirehoseDestinationProperty] = None,
    enabled: Option[Boolean] = None,
    cloudWatchDestination: Option[software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty] = None
  ): software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty =
    (new software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination.EventDestinationProperty.Builder)
      .matchingEventTypes(matchingEventTypes.asJava)
      .name(name.orNull)
      .kinesisFirehoseDestination(kinesisFirehoseDestination.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudWatchDestination(cloudWatchDestination.orNull)
      .build()
}
