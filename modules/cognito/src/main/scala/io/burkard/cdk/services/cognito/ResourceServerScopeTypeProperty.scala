package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceServerScopeTypeProperty {

  def apply(
    scopeDescription: Option[String] = None,
    scopeName: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder)
      .scopeDescription(scopeDescription.orNull)
      .scopeName(scopeName.orNull)
      .build()
}
