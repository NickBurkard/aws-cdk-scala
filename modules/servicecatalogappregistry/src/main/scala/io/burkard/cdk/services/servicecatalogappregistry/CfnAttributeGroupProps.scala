package io.burkard.cdk.services.servicecatalogappregistry

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAttributeGroupProps {

  def apply(
    name: Option[String] = None,
    attributes: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.Builder)
      .name(name.orNull)
      .attributes(attributes.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
