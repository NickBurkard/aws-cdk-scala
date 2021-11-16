package io.burkard.cdk.services.servicecatalogappregistry

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAttributeGroupProps {

  def apply(
    name: String,
    attributes: AnyRef,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  ): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps =
    (new software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps.Builder)
      .name(name)
      .attributes(attributes)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
