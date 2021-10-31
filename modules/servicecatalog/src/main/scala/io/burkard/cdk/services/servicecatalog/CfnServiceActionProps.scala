package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceActionProps {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None,
    definition: Option[List[_]] = None,
    definitionType: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .definition(definition.map(_.asJava).orNull)
      .definitionType(definitionType.orNull)
      .build()
}
