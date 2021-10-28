package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnEnterProperty {

  def apply(
    events: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnEnterProperty.Builder)
      .events(events.map(_.asJava).orNull)
      .build()
}
