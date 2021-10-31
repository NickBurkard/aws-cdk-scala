package io.burkard.cdk.services.timestream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTableProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    retentionProperties: Option[AnyRef] = None,
    tableName: Option[String] = None,
    databaseName: Option[String] = None
  ): software.amazon.awscdk.services.timestream.CfnTableProps =
    (new software.amazon.awscdk.services.timestream.CfnTableProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .retentionProperties(retentionProperties.orNull)
      .tableName(tableName.orNull)
      .databaseName(databaseName.orNull)
      .build()
}
