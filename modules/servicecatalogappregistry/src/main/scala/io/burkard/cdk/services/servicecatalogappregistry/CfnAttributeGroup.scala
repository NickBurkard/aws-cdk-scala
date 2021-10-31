package io.burkard.cdk.services.servicecatalogappregistry

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAttributeGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    attributes: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup =
    software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .attributes(attributes.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
