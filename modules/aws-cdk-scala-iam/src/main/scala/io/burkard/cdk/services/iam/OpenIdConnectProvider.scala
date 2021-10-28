package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenIdConnectProvider {

  def apply(
    internalResourceId: String,
    url: Option[String] = None,
    thumbprints: Option[List[String]] = None,
    clientIds: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.OpenIdConnectProvider =
    software.amazon.awscdk.services.iam.OpenIdConnectProvider.Builder
      .create(stackCtx, internalResourceId)
      .url(url.orNull)
      .thumbprints(thumbprints.map(_.asJava).orNull)
      .clientIds(clientIds.map(_.asJava).orNull)
      .build()
}
