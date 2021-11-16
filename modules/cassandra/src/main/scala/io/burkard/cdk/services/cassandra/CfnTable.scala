package io.burkard.cdk.services.cassandra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTable {

  def apply(
    internalResourceId: String,
    keyspaceName: String,
    partitionKeyColumns: List[_],
    clusteringKeyColumns: Option[List[_]] = None,
    billingMode: Option[software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty] = None,
    defaultTimeToLive: Option[Number] = None,
    tableName: Option[String] = None,
    encryptionSpecification: Option[software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty] = None,
    pointInTimeRecoveryEnabled: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    regularColumns: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cassandra.CfnTable =
    software.amazon.awscdk.services.cassandra.CfnTable.Builder
      .create(stackCtx, internalResourceId)
      .keyspaceName(keyspaceName)
      .partitionKeyColumns(partitionKeyColumns.asJava)
      .clusteringKeyColumns(clusteringKeyColumns.map(_.asJava).orNull)
      .billingMode(billingMode.orNull)
      .defaultTimeToLive(defaultTimeToLive.orNull)
      .tableName(tableName.orNull)
      .encryptionSpecification(encryptionSpecification.orNull)
      .pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .regularColumns(regularColumns.map(_.asJava).orNull)
      .build()
}
