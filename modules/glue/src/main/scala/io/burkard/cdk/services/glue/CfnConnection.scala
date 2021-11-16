package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnection {

  def apply(
    internalResourceId: String,
    connectionInput: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty,
    catalogId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnConnection =
    software.amazon.awscdk.services.glue.CfnConnection.Builder
      .create(stackCtx, internalResourceId)
      .connectionInput(connectionInput)
      .catalogId(catalogId)
      .build()
}
