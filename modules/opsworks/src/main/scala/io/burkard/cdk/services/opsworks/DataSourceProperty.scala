package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataSourceProperty {

  def apply(
    arn: Option[String] = None,
    databaseName: Option[String] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty =
    (new software.amazon.awscdk.services.opsworks.CfnApp.DataSourceProperty.Builder)
      .arn(arn.orNull)
      .databaseName(databaseName.orNull)
      .`type`(`type`.orNull)
      .build()
}
