package io.burkard.cdk.services.cassandra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTable {

  def apply(
    internalResourceId: String,
    clusteringKeyColumns: Option[List[_]] = None,
    billingMode: Option[software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty] = None,
    tableName: Option[String] = None,
    encryptionSpecification: Option[software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty] = None,
    pointInTimeRecoveryEnabled: Option[Boolean] = None,
    keyspaceName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    partitionKeyColumns: Option[List[_]] = None,
    regularColumns: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cassandra.CfnTable =
    software.amazon.awscdk.services.cassandra.CfnTable.Builder
      .create(stackCtx, internalResourceId)
      .clusteringKeyColumns(clusteringKeyColumns.map(_.asJava).orNull)
      .billingMode(billingMode.orNull)
      .tableName(tableName.orNull)
      .encryptionSpecification(encryptionSpecification.orNull)
      .pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .keyspaceName(keyspaceName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .partitionKeyColumns(partitionKeyColumns.map(_.asJava).orNull)
      .regularColumns(regularColumns.map(_.asJava).orNull)
      .build()
}
