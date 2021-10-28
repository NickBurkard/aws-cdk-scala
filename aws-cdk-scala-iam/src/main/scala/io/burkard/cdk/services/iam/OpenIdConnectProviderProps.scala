package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenIdConnectProviderProps {

  def apply(
    url: Option[String] = None,
    thumbprints: Option[List[String]] = None,
    clientIds: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.OpenIdConnectProviderProps =
    (new software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.Builder)
      .url(url.orNull)
      .thumbprints(thumbprints.map(_.asJava).orNull)
      .clientIds(clientIds.map(_.asJava).orNull)
      .build()
}
