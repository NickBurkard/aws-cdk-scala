package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GlueConfigurationProperty {

  def apply(
    tableName: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.GlueConfigurationProperty.Builder)
      .tableName(tableName.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
