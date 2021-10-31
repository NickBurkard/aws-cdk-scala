package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnection {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    authParameters: Option[AnyRef] = None,
    description: Option[String] = None,
    authorizationType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.events.CfnConnection =
    software.amazon.awscdk.services.events.CfnConnection.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .authParameters(authParameters.orNull)
      .description(description.orNull)
      .authorizationType(authorizationType.orNull)
      .build()
}
