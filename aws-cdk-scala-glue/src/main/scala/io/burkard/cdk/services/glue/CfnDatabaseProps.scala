package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDatabaseProps {

  def apply(
    catalogId: Option[String] = None,
    databaseInput: Option[software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty] = None
  ): software.amazon.awscdk.services.glue.CfnDatabaseProps =
    (new software.amazon.awscdk.services.glue.CfnDatabaseProps.Builder)
      .catalogId(catalogId.orNull)
      .databaseInput(databaseInput.orNull)
      .build()
}
