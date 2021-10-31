package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyGroupConfigProperty {

  def apply(
    name: Option[String] = None,
    items: Option[List[String]] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.Builder)
      .name(name.orNull)
      .items(items.map(_.asJava).orNull)
      .comment(comment.orNull)
      .build()
}
