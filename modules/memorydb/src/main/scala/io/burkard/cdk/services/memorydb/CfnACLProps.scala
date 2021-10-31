package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnACLProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    aclName: Option[String] = None,
    userNames: Option[List[String]] = None
  ): software.amazon.awscdk.services.memorydb.CfnACLProps =
    (new software.amazon.awscdk.services.memorydb.CfnACLProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .aclName(aclName.orNull)
      .userNames(userNames.map(_.asJava).orNull)
      .build()
}
