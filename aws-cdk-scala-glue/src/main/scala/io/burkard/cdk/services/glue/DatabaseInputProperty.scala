package io.burkard.cdk.services.glue

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInputProperty {

  def apply(
    description: Option[String] = None,
    targetDatabase: Option[software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty] = None,
    locationUri: Option[String] = None,
    parameters: Option[AnyRef] = None,
    name: Option[String] = None,
    createTableDefaultPermissions: Option[List[_]] = None
  ): software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty =
    (new software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.Builder)
      .description(description.orNull)
      .targetDatabase(targetDatabase.orNull)
      .locationUri(locationUri.orNull)
      .parameters(parameters.orNull)
      .name(name.orNull)
      .createTableDefaultPermissions(createTableDefaultPermissions.map(_.asJava).orNull)
      .build()
}
