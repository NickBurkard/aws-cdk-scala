package io.burkard.cdk.services.gamelift

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterConfigurationProperty {

  def apply(
    allowedLocations: Option[List[String]] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.FilterConfigurationProperty.Builder)
      .allowedLocations(allowedLocations.map(_.asJava).orNull)
      .build()
}
