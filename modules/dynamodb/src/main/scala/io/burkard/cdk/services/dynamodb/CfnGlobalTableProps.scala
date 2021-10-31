package io.burkard.cdk.services.dynamodb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGlobalTableProps {

  def apply(
    streamSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.StreamSpecificationProperty] = None,
    timeToLiveSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.TimeToLiveSpecificationProperty] = None,
    sseSpecification: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.SSESpecificationProperty] = None,
    tableName: Option[String] = None,
    localSecondaryIndexes: Option[List[_]] = None,
    writeProvisionedThroughputSettings: Option[software.amazon.awscdk.services.dynamodb.CfnGlobalTable.WriteProvisionedThroughputSettingsProperty] = None,
    keySchema: Option[List[_]] = None,
    attributeDefinitions: Option[List[_]] = None,
    globalSecondaryIndexes: Option[List[_]] = None,
    billingMode: Option[String] = None,
    replicas: Option[List[_]] = None
  ): software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps =
    (new software.amazon.awscdk.services.dynamodb.CfnGlobalTableProps.Builder)
      .streamSpecification(streamSpecification.orNull)
      .timeToLiveSpecification(timeToLiveSpecification.orNull)
      .sseSpecification(sseSpecification.orNull)
      .tableName(tableName.orNull)
      .localSecondaryIndexes(localSecondaryIndexes.map(_.asJava).orNull)
      .writeProvisionedThroughputSettings(writeProvisionedThroughputSettings.orNull)
      .keySchema(keySchema.map(_.asJava).orNull)
      .attributeDefinitions(attributeDefinitions.map(_.asJava).orNull)
      .globalSecondaryIndexes(globalSecondaryIndexes.map(_.asJava).orNull)
      .billingMode(billingMode.orNull)
      .replicas(replicas.map(_.asJava).orNull)
      .build()
}
