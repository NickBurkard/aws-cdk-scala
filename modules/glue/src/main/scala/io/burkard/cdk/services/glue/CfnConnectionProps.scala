package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectionProps {

  def apply(
    connectionInput: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty,
    catalogId: String
  ): software.amazon.awscdk.services.glue.CfnConnectionProps =
    (new software.amazon.awscdk.services.glue.CfnConnectionProps.Builder)
      .connectionInput(connectionInput)
      .catalogId(catalogId)
      .build()
}
