package io.burkard.cdk.services.servicecatalog

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnServiceAction {

  def apply(
    internalResourceId: String,
    name: String,
    definition: List[_],
    definitionType: String,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnServiceAction =
    software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .definition(definition.asJava)
      .definitionType(definitionType)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .build()
}
