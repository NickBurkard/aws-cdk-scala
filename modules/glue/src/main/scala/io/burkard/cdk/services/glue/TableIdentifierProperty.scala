package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TableIdentifierProperty {

  def apply(
    name: Option[String] = None,
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty =
    (new software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty.Builder)
      .name(name.orNull)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}