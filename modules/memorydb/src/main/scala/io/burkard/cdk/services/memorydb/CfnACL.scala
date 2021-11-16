package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnACL {

  def apply(
    internalResourceId: String,
    aclName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userNames: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnACL =
    software.amazon.awscdk.services.memorydb.CfnACL.Builder
      .create(stackCtx, internalResourceId)
      .aclName(aclName)
      .tags(tags.map(_.asJava).orNull)
      .userNames(userNames.map(_.asJava).orNull)
      .build()
}
