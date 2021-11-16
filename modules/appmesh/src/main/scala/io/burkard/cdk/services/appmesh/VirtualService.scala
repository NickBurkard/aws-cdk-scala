package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualService {

  def apply(
    internalResourceId: String,
    virtualServiceProvider: software.amazon.awscdk.services.appmesh.VirtualServiceProvider,
    virtualServiceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualService =
    software.amazon.awscdk.services.appmesh.VirtualService.Builder
      .create(stackCtx, internalResourceId)
      .virtualServiceProvider(virtualServiceProvider)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
