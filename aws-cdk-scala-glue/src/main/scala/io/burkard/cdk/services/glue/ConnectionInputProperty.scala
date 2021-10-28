package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
