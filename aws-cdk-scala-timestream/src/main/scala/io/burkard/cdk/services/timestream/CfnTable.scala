package io.burkard.cdk.services.timestream

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTable {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionProperties: Option[AnyRef] = None,
    tableName: Option[String] = None,
    databaseName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.timestream.CfnTable =
    software.amazon.awscdk.services.timestream.CfnTable.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .retentionProperties(retentionProperties.orNull)
      .tableName(tableName.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
