package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCustomResource {

  def apply(
    internalResourceId: String,
    serviceToken: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudformation.CfnCustomResource =
    software.amazon.awscdk.services.cloudformation.CfnCustomResource.Builder
      .create(stackCtx, internalResourceId)
      .serviceToken(serviceToken)
      .build()
}
