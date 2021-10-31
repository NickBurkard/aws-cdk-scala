package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RdsParametersProperty {

  def apply(
    instanceId: Option[String] = None,
    database: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty.Builder)
      .instanceId(instanceId.orNull)
      .database(database.orNull)
      .build()
}
