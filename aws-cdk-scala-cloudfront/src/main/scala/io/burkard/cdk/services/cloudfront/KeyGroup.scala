package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyGroup {

  def apply(
    internalResourceId: String,
    items: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey]] = None,
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.KeyGroup =
    software.amazon.awscdk.services.cloudfront.KeyGroup.Builder
      .create(stackCtx, internalResourceId)
      .items(items.map(_.asJava).orNull)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
