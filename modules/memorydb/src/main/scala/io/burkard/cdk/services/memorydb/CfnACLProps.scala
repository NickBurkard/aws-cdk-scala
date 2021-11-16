package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnACLProps {

  def apply(
    aclName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.memorydb.CfnACLProps =
    (new software.amazon.awscdk.services.memorydb.CfnACLProps.Builder)
      .aclName(aclName)
      .tags(tags.map(_.asJava).orNull)
      .userNames(userNames.map(_.asJava).orNull)
      .build()
}
