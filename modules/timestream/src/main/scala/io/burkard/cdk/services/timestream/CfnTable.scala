package io.burkard.cdk.services.timestream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
