package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualServiceProps {

  def apply(
    virtualServiceProvider: Option[software.amazon.awscdk.services.appmesh.VirtualServiceProvider] = None,
    virtualServiceName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.VirtualServiceProps =
    (new software.amazon.awscdk.services.appmesh.VirtualServiceProps.Builder)
      .virtualServiceProvider(virtualServiceProvider.orNull)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
