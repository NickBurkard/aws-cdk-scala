package io.burkard.cdk.services.iotevents

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnInputProps {

  def apply(
    inputDefinition: Option[software.amazon.awscdk.services.iotevents.CfnInput.InputDefinitionProperty] = None,
    inputName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    inputDescription: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnInputProps =
    (new software.amazon.awscdk.services.iotevents.CfnInputProps.Builder)
      .inputDefinition(inputDefinition.orNull)
      .inputName(inputName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .inputDescription(inputDescription.orNull)
      .build()
}
