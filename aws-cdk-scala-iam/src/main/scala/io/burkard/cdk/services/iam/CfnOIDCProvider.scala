package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOIDCProvider {

  def apply(
    internalResourceId: String,
    url: Option[String] = None,
    thumbprintList: Option[List[String]] = None,
    clientIdList: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnOIDCProvider =
    software.amazon.awscdk.services.iam.CfnOIDCProvider.Builder
      .create(stackCtx, internalResourceId)
      .url(url.orNull)
      .thumbprintList(thumbprintList.map(_.asJava).orNull)
      .clientIdList(clientIdList.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
