package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
