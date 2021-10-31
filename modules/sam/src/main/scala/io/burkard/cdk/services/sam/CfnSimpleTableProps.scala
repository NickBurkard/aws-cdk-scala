package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnSimpleTableProps {

  def apply(
    tags: Option[Map[String, String]] = None,
    provisionedThroughput: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.ProvisionedThroughputProperty] = None,
    tableName: Option[String] = None,
    primaryKey: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.PrimaryKeyProperty] = None,
    sseSpecification: Option[software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty] = None
  ): software.amazon.awscdk.services.sam.CfnSimpleTableProps =
    (new software.amazon.awscdk.services.sam.CfnSimpleTableProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .provisionedThroughput(provisionedThroughput.orNull)
      .tableName(tableName.orNull)
      .primaryKey(primaryKey.orNull)
      .sseSpecification(sseSpecification.orNull)
      .build()
}
