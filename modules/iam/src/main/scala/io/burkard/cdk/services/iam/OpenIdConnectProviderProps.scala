package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OpenIdConnectProviderProps {

  def apply(
    url: String,
    thumbprints: Option[List[String]] = None,
    clientIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.OpenIdConnectProviderProps =
    (new software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.Builder)
      .url(url)
      .thumbprints(thumbprints.map(_.asJava).orNull)
      .clientIds(clientIds.map(_.asJava).orNull)
      .build()
}
