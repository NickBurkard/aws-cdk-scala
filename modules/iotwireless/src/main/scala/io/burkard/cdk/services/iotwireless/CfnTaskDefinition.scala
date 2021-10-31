package io.burkard.cdk.services.iotwireless

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTaskDefinition {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    loRaWanUpdateGatewayTaskEntry: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty] = None,
    taskDefinitionType: Option[String] = None,
    update: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty] = None,
    autoCreateTasks: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition =
    software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.orNull)
      .taskDefinitionType(taskDefinitionType.orNull)
      .update(update.orNull)
      .autoCreateTasks(autoCreateTasks.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
