package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnSimpleTable {

  def apply(
    internalResourceId: String,
    tags: Option[Map[String, String]] = None,
    provisionedThroughput: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty] = None,
    tableName: Option[String] = None,
    primaryKey: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty] = None,
    sseSpecification: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnSimpleTable =
    software.amazon.awscdk.services.sam.CfnSimpleTable.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .provisionedThroughput(provisionedThroughput.orNull)
      .tableName(tableName.orNull)
      .primaryKey(primaryKey.orNull)
      .sseSpecification(sseSpecification.orNull)
      .build()
}
