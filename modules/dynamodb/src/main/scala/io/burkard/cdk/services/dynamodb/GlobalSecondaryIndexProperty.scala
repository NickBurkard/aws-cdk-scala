package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalSecondaryIndexProperty {

  def apply(
    projection: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty] = None,
    indexName: Option[String] = None,
    writeProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty] = None,
    keySchema: Option[List[_]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.Builder)
      .projection(projection.orNull)
      .indexName(indexName.orNull)
      .writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.orNull)
      .keySchema(keySchema.map(_.asJava).orNull)
      .build()
}
