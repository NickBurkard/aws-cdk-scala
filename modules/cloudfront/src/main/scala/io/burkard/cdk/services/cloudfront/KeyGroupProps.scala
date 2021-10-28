package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyGroupProps {

  def apply(
    items: Option[List[_ <: software.amazon.awscdk.services.cloudfront.IPublicKey]] = None,
    comment: Option[String] = None,
    keyGroupName: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.KeyGroupProps =
    (new software.amazon.awscdk.services.cloudfront.KeyGroupProps.Builder)
      .items(items.map(_.asJava).orNull)
      .comment(comment.orNull)
      .keyGroupName(keyGroupName.orNull)
      .build()
}
