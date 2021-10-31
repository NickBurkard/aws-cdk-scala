package io.burkard.cdk.services.cassandra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnKeyspace {

  def apply(
    internalResourceId: String,
    keyspaceName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cassandra.CfnKeyspace =
    software.amazon.awscdk.services.cassandra.CfnKeyspace.Builder
      .create(stackCtx, internalResourceId)
      .keyspaceName(keyspaceName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
