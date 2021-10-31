package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDatabase {

  def apply(
    internalResourceId: String,
    catalogId: Option[String] = None,
    databaseInput: Option[software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnDatabase =
    software.amazon.awscdk.services.glue.CfnDatabase.Builder
      .create(stackCtx, internalResourceId)
      .catalogId(catalogId.orNull)
      .databaseInput(databaseInput.orNull)
      .build()
}
