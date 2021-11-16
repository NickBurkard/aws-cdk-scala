package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomResource {

  def apply(
    internalResourceId: String,
    serviceToken: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnCustomResource =
    software.amazon.awscdk.CfnCustomResource.Builder
      .create(stackCtx, internalResourceId)
      .serviceToken(serviceToken)
      .build()
}
