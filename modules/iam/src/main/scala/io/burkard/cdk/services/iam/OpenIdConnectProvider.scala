package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
