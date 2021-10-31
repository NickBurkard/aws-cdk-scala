package io.burkard.cdk.services.timestream

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDatabase {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    databaseName: Option[String] = None,
    kmsKeyId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.timestream.CfnDatabase =
    software.amazon.awscdk.services.timestream.CfnDatabase.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .databaseName(databaseName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
