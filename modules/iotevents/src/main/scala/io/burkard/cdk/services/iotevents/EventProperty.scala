package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventProperty {

  def apply(
    eventName: Option[String] = None,
    condition: Option[String] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.EventProperty.Builder)
      .eventName(eventName.orNull)
      .condition(condition.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
