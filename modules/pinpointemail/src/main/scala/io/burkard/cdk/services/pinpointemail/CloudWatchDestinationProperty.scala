package io.burkard.cdk.services.pinpointemail

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchDestinationProperty {

  def apply(
    dimensionConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder)
      .dimensionConfigurations(dimensionConfigurations.map(_.asJava).orNull)
      .build()
}
