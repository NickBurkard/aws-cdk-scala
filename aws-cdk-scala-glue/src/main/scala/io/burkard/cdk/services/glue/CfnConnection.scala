package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnection {

  def apply(
    internalResourceId: String,
    connectionInput: Option[software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty] = None,
    catalogId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.glue.CfnConnection =
    software.amazon.awscdk.services.glue.CfnConnection.Builder
      .create(stackCtx, internalResourceId)
      .connectionInput(connectionInput.orNull)
      .catalogId(catalogId.orNull)
      .build()
}
