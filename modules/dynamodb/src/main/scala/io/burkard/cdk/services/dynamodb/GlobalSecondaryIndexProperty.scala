package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalSecondaryIndexProperty {

  def apply(
    projection: software.amazon.awscdk.services.dynamodb.CfnGlobalTable.ProjectionProperty,
    indexName: String,
    keySchema: List[_],
    writeProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTable.GlobalSecondaryIndexProperty.Builder)
      .projection(projection)
      .indexName(indexName)
      .keySchema(keySchema.asJava)
      .writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.orNull)
      .build()
}
