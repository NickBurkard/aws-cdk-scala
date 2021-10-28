package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KernelCapabilitiesProperty {

  def apply(
    drop: Option[List[String]] = None,
    add: Option[List[String]] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.KernelCapabilitiesProperty.Builder)
      .drop(drop.map(_.asJava).orNull)
      .add(add.map(_.asJava).orNull)
      .build()
}
