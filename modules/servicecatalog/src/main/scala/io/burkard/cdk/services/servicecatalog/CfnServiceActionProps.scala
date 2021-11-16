package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceActionProps {

  def apply(
    name: String,
    definition: List[_],
    definitionType: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  ): software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps =
    (new software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps.Builder)
      .name(name)
      .definition(definition.asJava)
      .definitionType(definitionType)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
