package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DetectorModelDefinitionProperty {

  def apply(
    initialStateName: Option[String] = None,
    states: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.DetectorModelDefinitionProperty.Builder)
      .initialStateName(initialStateName.orNull)
      .states(states.map(_.asJava).orNull)
      .build()
}
