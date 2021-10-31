package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnACL {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    aclName: Option[String] = None,
    userNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnACL =
    software.amazon.awscdk.services.memorydb.CfnACL.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .aclName(aclName.orNull)
      .userNames(userNames.map(_.asJava).orNull)
      .build()
}
