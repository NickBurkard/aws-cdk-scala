package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransitionEventProperty {

  def apply(
    eventName: String,
    nextState: String,
    condition: String,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.TransitionEventProperty.Builder)
      .eventName(eventName)
      .nextState(nextState)
      .condition(condition)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
