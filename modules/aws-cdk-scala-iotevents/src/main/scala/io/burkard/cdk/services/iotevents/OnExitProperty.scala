package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnExitProperty {

  def apply(
    events: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.Builder)
      .events(events.map(_.asJava).orNull)
      .build()
}
