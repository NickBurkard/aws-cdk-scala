package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnServiceAction {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    description: Option[String] = None,
    acceptLanguage: Option[String] = None,
    definition: Option[List[_]] = None,
    definitionType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.servicecatalog.CfnServiceAction =
    software.amazon.awscdk.services.servicecatalog.CfnServiceAction.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .description(description.orNull)
      .acceptLanguage(acceptLanguage.orNull)
      .definition(definition.map(_.asJava).orNull)
      .definitionType(definitionType.orNull)
      .build()
}
