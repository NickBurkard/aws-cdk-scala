package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseIdentifierProperty {

  def apply(
    catalogId: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty =
    (new software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.Builder)
      .catalogId(catalogId.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
