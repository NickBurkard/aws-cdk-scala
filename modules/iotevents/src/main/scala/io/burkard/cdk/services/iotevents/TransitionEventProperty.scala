package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransitionEventProperty {

  def apply(
    eventName: Option[String] = None,
    nextState: Option[String] = None,
    condition: Option[String] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.Builder)
      .eventName(eventName.orNull)
      .nextState(nextState.orNull)
      .condition(condition.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
