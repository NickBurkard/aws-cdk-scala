package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnExitProperty {

  def apply(
    events: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.OnExitProperty.Builder)
      .events(events.map(_.asJava).orNull)
      .build()
}
