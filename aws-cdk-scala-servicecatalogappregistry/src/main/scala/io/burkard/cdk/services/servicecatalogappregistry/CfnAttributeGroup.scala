package io.burkard.cdk.services.servicecatalogappregistry

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
