package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGlobalTableProps {

  def apply(
    keySchema: List[_],
    attributeDefinitions: List[_],
    replicas: List[_],
    streamSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty] = None,
    timeToLiveSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty] = None,
    tableName: Option[String] = None,
    localSecondaryIndexes: Option[List[_]] = None,
    writeProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty] = None,
    globalSecondaryIndexes: Option[List[_]] = None,
    billingMode: Option[String] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.Builder)
      .keySchema(keySchema.asJava)
      .attributeDefinitions(attributeDefinitions.asJava)
      .replicas(replicas.asJava)
      .streamSpecification(streamSpecification.orNull)
      .timeToLiveSpecification(timeToLiveSpecification.orNull)
      .sseSpecification(sseSpecification.orNull)
      .tableName(tableName.orNull)
      .localSecondaryIndexes(localSecondaryIndexes.map(_.asJava).orNull)
      .writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.orNull)
      .globalSecondaryIndexes(globalSecondaryIndexes.map(_.asJava).orNull)
      .billingMode(billingMode.orNull)
      .build()
}
