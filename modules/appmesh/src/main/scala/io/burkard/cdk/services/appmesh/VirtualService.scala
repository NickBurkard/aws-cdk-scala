package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualService {

  def apply(
    internalResourceId: String,
    virtualServiceProvider: Option[software.amazon.awscdk.services.appmesh.VirtualServiceProvider] = None,
    virtualServiceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualService =
    software.amazon.awscdk.services.appmesh.VirtualService.Builder
      .create(stackCtx, internalResourceId)
      .virtualServiceProvider(virtualServiceProvider.orNull)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
