package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
