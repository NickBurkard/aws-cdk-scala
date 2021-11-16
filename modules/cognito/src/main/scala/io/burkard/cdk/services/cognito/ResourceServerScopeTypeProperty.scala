package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceServerScopeTypeProperty {

  def apply(
    scopeDescription: String,
    scopeName: String
  ): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer.ResourceServerScopeTypeProperty.Builder)
      .scopeDescription(scopeDescription)
      .scopeName(scopeName)
      .build()
}
