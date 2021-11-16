package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyGroupProps {

  def apply(
    items: List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey],
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.KeyGroupProps =
    (new software.amazon.awscdk.services.cloudfront.KeyGroupProps.Builder)
      .items(items.asJava)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
