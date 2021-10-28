package io.burkard.cdk.services.athena

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDataCatalogProps {

  def apply(
    name: Option[String] = None,
    `type`: Option[String] = None,
    parameters: Option[Map[String, String]] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.athena.CfnDataCatalogProps =
    (new software.amazon.awscdk.services.athena.CfnDataCatalogProps.Builder)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
