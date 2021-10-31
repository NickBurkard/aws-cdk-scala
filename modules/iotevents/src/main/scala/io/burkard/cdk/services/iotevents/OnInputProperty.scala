package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
