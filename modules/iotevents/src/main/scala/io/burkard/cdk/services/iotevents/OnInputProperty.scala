package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnInputProperty {

  def apply(
    transitionEvents: Option[List[_]] = None,
    events: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnInputProperty.Builder)
      .transitionEvents(transitionEvents.map(_.asJava).orNull)
      .events(events.map(_.asJava).orNull)
      .build()
}
