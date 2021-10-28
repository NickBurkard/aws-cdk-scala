package io.burkard.cdk.services.servicecatalogappregistry

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplicationProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
