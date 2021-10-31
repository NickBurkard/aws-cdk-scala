package io.burkard.cdk.services.iotevents

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputDefinitionProperty {

  def apply(
    attributes: Option[List[_]] = None
  ): software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty =
    (new software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty.Builder)
      .attributes(attributes.map(_.asJava).orNull)
      .build()
}
