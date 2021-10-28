package io.burkard.cdk.services.eks

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OpenIdConnectProviderProps {

  def apply(
    url: Option[String] = None
  ): software.amazon.awscdk.services.eks.OpenIdConnectProviderProps =
    (new software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.Builder)
      .url(url.orNull)
      .build()
}
