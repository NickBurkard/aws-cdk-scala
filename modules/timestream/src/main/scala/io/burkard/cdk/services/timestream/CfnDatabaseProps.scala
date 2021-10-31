package io.burkard.cdk.services.timestream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDatabaseProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    databaseName: Option[String] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.timestream.CfnDatabaseProps =
    (new software.amazon.awscdk.services.timestream.CfnDatabaseProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .databaseName(databaseName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
