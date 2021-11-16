package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnection {

  def apply(
    internalResourceId: String,
    authParameters: AnyRef,
    authorizationType: String,
    name: Option[String] = None,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnConnection =
    software.amazon.awscdk.services.events.CfnConnection.Builder
      .create(stackCtx, internalResourceId)
      .authParameters(authParameters)
      .authorizationType(authorizationType)
      .name(name.orNull)
      .description(description.orNull)
      .build()
}
