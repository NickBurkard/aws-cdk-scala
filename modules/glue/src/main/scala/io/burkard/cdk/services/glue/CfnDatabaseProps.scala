package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDatabaseProps {

  def apply(
    catalogId: String,
    databaseInput: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty
  ): software.amazon.awscdk.services.glue.CfnDatabaseProps =
    (new software.amazon.awscdk.services.glue.CfnDatabaseProps.Builder)
      .catalogId(catalogId)
      .databaseInput(databaseInput)
      .build()
}
