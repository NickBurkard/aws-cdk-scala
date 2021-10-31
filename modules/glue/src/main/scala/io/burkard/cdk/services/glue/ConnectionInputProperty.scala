package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectionInputProperty {

  def apply(
    name: Option[String] = None,
    description: Option[String] = None,
    connectionProperties: Option[AnyRef] = None,
    matchCriteria: Option[List[String]] = None,
    physicalConnectionRequirements: Option[software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty] = None,
    connectionType: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty =
    (new software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.Builder)
      .name(name.orNull)
      .description(description.orNull)
      .connectionProperties(connectionProperties.orNull)
      .matchCriteria(matchCriteria.map(_.asJava).orNull)
      .physicalConnectionRequirements(physicalConnectionRequirements.orNull)
      .connectionType(connectionType.orNull)
      .build()
}
