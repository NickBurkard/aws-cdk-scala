package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KeyGroup {

  def apply(
    internalResourceId: String,
    items: List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey],
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.KeyGroup =
    software.amazon.awscdk.services.cloudfront.KeyGroup.Builder
      .create(stackCtx, internalResourceId)
      .items(items.asJava)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
