package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTaskDefinitionProps {

  def apply(
    autoCreateTasks: Boolean,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    loRaWanUpdateGatewayTaskEntry: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty] = None,
    taskDefinitionType: Option[String] = None,
    update: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty] = None
  ): software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps =
    (new software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps.Builder)
      .autoCreateTasks(autoCreateTasks)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.orNull)
      .taskDefinitionType(taskDefinitionType.orNull)
      .update(update.orNull)
      .build()
}
