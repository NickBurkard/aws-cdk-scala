package io.burkard.cdk.services.pinpointemail

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudWatchDestinationProperty {

  def apply(
    dimensionConfigurations: Option[List[_]] = None
  ): software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty =
    (new software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetEventDestination.CloudWatchDestinationProperty.Builder)
      .dimensionConfigurations(dimensionConfigurations.map(_.asJava).orNull)
      .build()
}
