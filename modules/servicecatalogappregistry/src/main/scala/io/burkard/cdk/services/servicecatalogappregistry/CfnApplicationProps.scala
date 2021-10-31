package io.burkard.cdk.services.servicecatalogappregistry

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
