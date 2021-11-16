package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyGroupConfigProperty {

  def apply(
    name: String,
    items: List[String],
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnKeyGroup.KeyGroupConfigProperty.Builder)
      .name(name)
      .items(items.asJava)
      .comment(comment.orNull)
      .build()
}
