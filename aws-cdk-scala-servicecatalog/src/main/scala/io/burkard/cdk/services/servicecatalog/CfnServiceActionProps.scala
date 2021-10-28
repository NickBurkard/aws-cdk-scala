package io.burkard.cdk.services.servicecatalog

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
