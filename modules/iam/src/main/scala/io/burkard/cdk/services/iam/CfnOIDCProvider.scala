package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOIDCProvider {

  def apply(
    internalResourceId: String,
    thumbprintList: List[String],
    url: Option[String] = None,
    clientIdList: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnOIDCProvider =
    software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder
      .create(stackCtx, internalResourceId)
      .thumbprintList(thumbprintList.asJava)
      .url(url.orNull)
      .clientIdList(clientIdList.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
