package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryExecutionContext {

  def apply(
    catalogName: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext =
    (new software.amazon.awscdk.services.stepfunctions.tasks.QueryExecutionContext.Builder)
      .catalogName(catalogName.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
